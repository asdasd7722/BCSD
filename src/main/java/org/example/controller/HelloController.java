package org.example.controller;

import org.example.aop.Execute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping(value = "helloBody", method = RequestMethod.GET)
    @ResponseBody
    @Execute
    public String hello() {
        return "Hello Spring (text)";
    }

    @RequestMapping(value ="hello", method = RequestMethod.GET)
    @Execute
    public String helloBody() {
        return "hello";
    }
}