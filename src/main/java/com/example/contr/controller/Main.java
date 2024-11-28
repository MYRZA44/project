package com.example.contr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Main {

    @GetMapping("/index.html")
    public String greeting( String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

}




