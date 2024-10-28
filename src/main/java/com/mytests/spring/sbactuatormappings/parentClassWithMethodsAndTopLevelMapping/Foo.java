package com.mytests.spring.sbactuatormappings.parentClassWithMethodsAndTopLevelMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/foo/parent/top")
public class Foo {

    @GetMapping("/parent_method/first")
    public String method_first() {
        return "method/first";
    }

    @GetMapping("/parent_method/second")
    public String methods_second() {
        return "methods/second";
    }
}
