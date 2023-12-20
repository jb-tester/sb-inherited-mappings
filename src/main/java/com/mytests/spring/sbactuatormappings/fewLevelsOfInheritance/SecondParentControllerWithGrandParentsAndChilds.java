package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritance;

import org.springframework.web.bind.annotation.GetMapping;

public class SecondParentControllerWithGrandParentsAndChilds implements GrandpaInterface, GrandmaInterface
{

    @GetMapping({"/motherMapping"})
    public String parent(){
        return "parent";
    }

    @Override
    public String grandpa1() {
        return "from grandpa interface";
    }

    @Override
    public String grandma1() {
        return "from grandpa interface";
    }
}
