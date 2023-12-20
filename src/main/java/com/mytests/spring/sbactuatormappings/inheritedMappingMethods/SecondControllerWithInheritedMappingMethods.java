package com.mytests.spring.sbactuatormappings.inheritedMappingMethods;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Endpoints and HTTP Requests are correct (but can't be invoked from this class methods)
// class-level OpenAPI draft doesn't include mappings
@RestController
@RequestMapping("/ownTopTwo")
public class SecondControllerWithInheritedMappingMethods implements NotAnnotatedParentWithMappings {
    @Override
    public String test1() {
        return "parentTest1";
    }

    @Override
    public String test2() {
        return "parentTest2";
    }

    @GetMapping("/ownTest3")
    public String test3() {
        return "ownTest3";
    }
}
