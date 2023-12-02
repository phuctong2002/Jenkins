package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/job")
public class JobController {
    @GetMapping( "")
    public String getAllJobs(){
        return "All jobs";
    }
}
