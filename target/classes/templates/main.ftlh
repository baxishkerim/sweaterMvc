 <#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<@c.page>

    <div>

        <@l.logout />
        <span><a href="/user">User list</a></span>
    </div>
    <div>
        <form method="post" enctype="multipart/form-data">
            <label>
                <input type="text" name="text" placeholder="Ввидте сообщение">
            </label>
            <label>
                <input type="text" name="tag" placeholder="Тэг">
                <input type="file" name="file">
            </label>

            <button type="submit">Добавить</button>
        </form>
    </div>
    <div>Cписок сообщений</div>
    <form method="get" action="/main">
        <input type="text" name="filter" value="${filter?ifExists}">
        <button type="submit">Найти</button>
    </form>
    </form>
    <#list messages as message>
    <div>
        <b>${message.id}</b>
        <span>${message.text}</span>
        <i>${message.tag}</i>
        <strong>${message.authorName}</strong>
        <div>
            <#if message.filename??>
                <img src="/img/${message.filename}">
            </#if>
        </div>
    </div>
    <#else>
    No messages
    </#list>>
</@c.page>