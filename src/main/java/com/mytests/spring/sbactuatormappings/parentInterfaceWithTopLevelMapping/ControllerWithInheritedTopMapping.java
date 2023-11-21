package com.mytests.spring.sbactuatormappings.parentInterfaceWithTopLevelMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWithInheritedTopMapping implements ControllerWithInheritedTopMappingDefinition {

    @GetMapping("/test1")
    public String test1() {
        return "toplevel test1";
    }
    @GetMapping("/test2")
    public String test2() {
        return "toplevel top2";
    }
}
