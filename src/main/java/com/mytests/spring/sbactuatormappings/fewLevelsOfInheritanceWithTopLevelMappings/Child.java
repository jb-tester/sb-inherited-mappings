package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritanceWithTopLevelMappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Child implements Parent {

    // expected: endpoint is shown as /grand/child/test1
    // actual: it appears as /child/test1
    @GetMapping("/child/test1")
    public String test1() {
        return "hello!";
    }
}
