package com.learning.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerController {
    @RequestMapping("/test")
    public String test() {
        return "Hello learner from App Version 1 ";
    }
}
