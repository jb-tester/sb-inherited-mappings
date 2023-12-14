package com.mytests.spring.sbactuatormappings.multipleChilds;

import org.springframework.web.bind.annotation.RequestMapping;

public abstract class ParentControllerWith3Childs {

    @RequestMapping("/multiple/parentMapping")
    public String parent(){
        return "parent";
    }
}
