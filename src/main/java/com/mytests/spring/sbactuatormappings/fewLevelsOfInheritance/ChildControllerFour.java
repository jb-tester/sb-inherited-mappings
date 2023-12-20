package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grandson/fourth")
public class ChildControllerFour extends SecondParentControllerWithGrandParentsAndChilds {

    @GetMapping("/fourthChildOwn")
    public String ch4(){
        return "fourth child";
    }
}
