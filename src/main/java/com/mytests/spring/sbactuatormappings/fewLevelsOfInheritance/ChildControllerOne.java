package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grandson/first")
public class ChildControllerOne extends ParentControllerWithGrandParentsAndChilds {

    @RequestMapping("/firstChildOwn")
    public String ch1(){
        return "first child";
    }
}
