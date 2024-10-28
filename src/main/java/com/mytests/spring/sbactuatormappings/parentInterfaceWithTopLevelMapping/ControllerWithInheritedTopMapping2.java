package com.mytests.spring.sbactuatormappings.parentInterfaceWithTopLevelMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWithInheritedTopMapping2 implements ControllerWithInheritedTopMappingDefinition {

    @GetMapping("/test3")
    public String test3() {
        return "toplevel test3";
    }
    @GetMapping("/test4")
    public String test4() {
        return "toplevel top4";
    }
}
