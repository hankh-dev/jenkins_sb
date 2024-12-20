package org.example.jenkins_sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class TestController {

    @GetMapping("/test")
    List<String> all() {
        System.out.println("GET /test");
        List<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("kh");
        strings.add("i`m ms");
        strings.add("nice to meet you");
        strings.add("hou are you?");
        return strings;
    }

}