package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grandson/third")
public class ChildControllerThree extends SecondParentControllerWithGrandParentsAndChilds {

    @GetMapping("/thirdChildOwn")
    public String ch3(){
        return "third child";
    }
}
