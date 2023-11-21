package com.mytests.spring.sbactuatormappings.inheritedMultipleTopLevelMappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWithInheritedMultipleTopMappings extends ParentWithMultipleTopMappings {

    // expected: 2 endpoints (/topone/test1 and /toptwo/test1) are shown in Endpoints,
    // 2 http requests are generated
    // 2 paths in OpenApi draft
    // actual: just "/test1" everywhere, both prefixes are ignored everywhere
    @GetMapping("/test1")
    public String test1() {
        return "controllerWithInheritedMultipleTopMappings test1";
    }

}
