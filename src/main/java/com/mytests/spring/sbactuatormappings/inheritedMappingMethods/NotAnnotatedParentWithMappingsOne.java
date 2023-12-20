package com.mytests.spring.sbactuatormappings.inheritedMappingMethods;


import org.springframework.web.bind.annotation.GetMapping;

public interface NotAnnotatedParentWithMappingsOne {
    @GetMapping("/parentTest1")
    String test1();

}
