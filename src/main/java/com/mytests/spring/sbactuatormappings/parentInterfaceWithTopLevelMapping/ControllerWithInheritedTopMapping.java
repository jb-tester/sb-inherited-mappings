package com.mytests.spring.sbactuatormappings.parentInterfaceWithTopLevelMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWithInheritedTopMapping implements ControllerWithInheritedTopMappingDefinition {

    // expected: endpoints are shown as /toplevel/test1, /toplevel/test2
    // actual: they are shown as /test1 and /test2
    @GetMapping("/test1")
    public String test1() {
        return "toplevel test1";
    }
    @GetMapping("/test2")
    public String test2() {
        return "toplevel top2";
    }
}
