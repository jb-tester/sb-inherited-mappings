package com.mytests.spring.sbactuatormappings.multipleChilds;

import org.springframework.web.bind.annotation.RequestMapping;

public class ParentControllerWith3Childs {

    @RequestMapping({"/parentMapping"})
    public String parent(){
        return "parent";
    }

}
