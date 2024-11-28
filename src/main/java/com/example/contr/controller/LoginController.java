package com.example.contr.controller;

import com.example.contr.Repository.mainRepo;
import com.example.contr.model.MainModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {
    @Autowired
    private mainRepo database;

    @GetMapping("/login.html")
    public String greeting() {
        return "login";
    }

    @PostMapping(value = "/login.html")
    public String great(String username, String password) {
        MainModel data2 = new MainModel(username, password);
        database.save(data2);
          return "index";
    }
}