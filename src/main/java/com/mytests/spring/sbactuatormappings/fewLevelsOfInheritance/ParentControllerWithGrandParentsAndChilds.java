package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritance;

import org.springframework.web.bind.annotation.RequestMapping;

public class ParentControllerWithGrandParentsAndChilds implements GrandpaInterface, GrandmaInterface
{

    @RequestMapping({"/fatherMapping"})
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