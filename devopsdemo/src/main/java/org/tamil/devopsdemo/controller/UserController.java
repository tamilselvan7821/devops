package org.tamil.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/view")
    public String getName(){
        return "Tamil selvan";
    }
}
