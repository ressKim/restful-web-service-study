package com.study.restfulwebservice.helloworld;

import com.study.restfulwebservice.user.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    //GET
    //hello-word (endpoint)
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("hello World");
    }

    //hello-world-bean/path-variable/{name}
    @GetMapping(path = "hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }

}
