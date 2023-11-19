package com.mytests.spring.sbactuatormappings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class MyController {

    @GetMapping()
    public String test0() {
        return "test0";
    }
    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/foo/test2")
    public String fooTest2() {
        return "foo/test2";
    }
}
