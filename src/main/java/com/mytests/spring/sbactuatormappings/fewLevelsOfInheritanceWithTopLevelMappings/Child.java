package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritanceWithTopLevelMappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Child implements Parent {

    @GetMapping("/child/test1")
    public String test1() {
        return "hello!";
    }
}
