package com.mytests.spring.sbactuatormappings.multipleChilds;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/multiple/second")
public class SecondChildController extends ParentControllerWith3Childs
{
    @RequestMapping("/secondChildMapping")
    public String ch2(){
        return "second child";
    }
}
