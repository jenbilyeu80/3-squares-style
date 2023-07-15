package org.launch.PracticeChris.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return"Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return"Goodbye, Spring!";
    }
}