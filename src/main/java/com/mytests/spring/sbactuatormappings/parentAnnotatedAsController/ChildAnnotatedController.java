package com.mytests.spring.sbactuatormappings.parentAnnotatedAsController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/annotatedChild1")
public class ChildAnnotatedController extends ParentAnnotatedController {

    // this endpoint is shown, but the inherited one (/annotatedChild1/parentMapping) is not shown
    @GetMapping("/own")
    public String child1() {
        return "child1";
    }
}
