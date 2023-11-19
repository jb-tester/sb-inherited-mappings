package com.mytests.spring.sbactuatormappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController implements NewControllerDefinition {

    @GetMapping("/bar")
    public String bar() {
        return "new bar";
    }
    @GetMapping("/foo")
    public String foo() {
        return "new foo";
    }
}
