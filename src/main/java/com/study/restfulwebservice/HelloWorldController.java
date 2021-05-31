package com.study.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    //hello-word (endpoint)
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "hello world";
    }

}
