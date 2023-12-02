package com.example.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
//    test trigger
    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }
}
