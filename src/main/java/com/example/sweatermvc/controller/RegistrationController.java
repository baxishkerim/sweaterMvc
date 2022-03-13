package com.example.sweatermvc.controller;


import com.example.sweatermvc.domain.Role;
import com.example.sweatermvc.domain.User;
import com.example.sweatermvc.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {

    @Autowired
    UserRepo userRepo;


    @GetMapping("/registration")
    public String registration() {
        return "registration";

    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model) {

        User userFromDb = userRepo.findByUsername(user.getUsername());

        if (userFromDb != null) {
            model.put("message", "User exists!");
            return "registration";
        }

        user.setActive(true);
        user.setRoleSet(Collections.singleton(Role.USER));
        userRepo.save(user);


        return "redirect:/login";

    }
}
