package com.example.john.springazureactivedirectory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By john on Sep, 2019
 **/

public class HelloController {
    @Autowired
    @PreAuthorize("hasRole('AllDev')")
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
