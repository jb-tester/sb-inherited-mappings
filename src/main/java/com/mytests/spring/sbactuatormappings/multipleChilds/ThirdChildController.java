package com.mytests.spring.sbactuatormappings.multipleChilds;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdChildController extends ParentControllerWith3Childs
{
    @RequestMapping("/multiple/thirdChildMapping")
    public String ch3(){
        return "third child";
    }
}
