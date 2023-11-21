package com.mytests.spring.sbactuatormappings.multipleTopLevelMappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/aaa","bbb"})
public class ControllerWithMultipleTopMappings {

    // "/bbb" prefix is ignored in the generated OpenAPI draft
    @GetMapping()
    public String test0() {
        return "test0";
    }
    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping({"/test2","/test3"})
    public String fooTest2() {
        return "test2, test3";
    }
}
