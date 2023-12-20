package com.mytests.spring.sbactuatormappings.multipleChilds;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/multiple/first")
public class FirstChildController extends ParentControllerWith3Childs {

    @RequestMapping("/firstChildMapping")
    public String ch1(){
        return "first child";
    }
}
