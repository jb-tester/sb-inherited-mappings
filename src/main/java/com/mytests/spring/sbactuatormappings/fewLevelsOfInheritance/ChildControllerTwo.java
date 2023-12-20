package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grandson/second")
public class ChildControllerTwo extends ParentControllerWithGrandParentsAndChilds {

    @GetMapping("/secondChildOwn")
    public String ch1(){
        return "second child";
    }
}
