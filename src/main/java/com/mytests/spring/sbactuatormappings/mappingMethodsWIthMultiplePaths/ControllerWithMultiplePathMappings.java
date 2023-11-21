package com.mytests.spring.sbactuatormappings.mappingMethodsWIthMultiplePaths;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWithMultiplePathMappings {
    // ok
    @GetMapping({"/one/test1","/two/test2"})
    public String test() {
        return "test1, test2";
    }
}
