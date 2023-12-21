package com.nmt.handmadestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class HomeController {
    
    @RequestMapping("/")
    public String renderHomePage() {
        return "index";
    }
}
