package com.example.pharmacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PormController {
    @GetMapping("/")
    public String mainForm() {
        return "main";
    }

    @GetMapping("/output")
    public String outputForm() {
        return "output";
    }
}
