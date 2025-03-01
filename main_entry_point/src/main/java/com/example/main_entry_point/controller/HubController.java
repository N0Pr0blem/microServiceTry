package com.example.main_entry_point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hub")
public class HubController {

    @GetMapping
    public String getHubPage(Model model){
        return "hub";
    }
}
