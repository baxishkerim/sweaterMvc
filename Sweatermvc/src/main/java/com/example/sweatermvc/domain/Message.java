package com.example.sweatermvc.domain;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    private  String text;
    private  String tag;

    public Message() {

    }

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }
}