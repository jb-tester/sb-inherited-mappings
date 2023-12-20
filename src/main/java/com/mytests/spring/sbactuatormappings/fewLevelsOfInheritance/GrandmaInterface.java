package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritance;


import org.springframework.web.bind.annotation.GetMapping;

public interface GrandmaInterface {
    @GetMapping("/grandparentMappingTwo")
    String grandma1();
}
