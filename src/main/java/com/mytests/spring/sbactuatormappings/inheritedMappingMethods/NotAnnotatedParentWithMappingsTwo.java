package com.mytests.spring.sbactuatormappings.inheritedMappingMethods;


import org.springframework.web.bind.annotation.GetMapping;

public interface NotAnnotatedParentWithMappingsTwo {

    @GetMapping("/parentTest2")
    String test2();
}
