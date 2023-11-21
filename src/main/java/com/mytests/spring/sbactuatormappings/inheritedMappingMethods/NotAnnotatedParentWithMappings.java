package com.mytests.spring.sbactuatormappings.inheritedMappingMethods;


import org.springframework.web.bind.annotation.GetMapping;

public interface NotAnnotatedParentWithMappings {
    @GetMapping("/parentTest1")
    String test1();
    @GetMapping("/parentTest2")
    String test2();
}
