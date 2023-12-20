package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritance;


import org.springframework.web.bind.annotation.GetMapping;

public interface GrandpaInterface {
    @GetMapping("/grandparentMappingOne")
    String grandpa1();
}
