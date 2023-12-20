package com.mytests.spring.sbactuatormappings.multipleChilds;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multiple/third")
public class ThirdChildController extends ParentControllerWith3Childs
{
    @RequestMapping("/thirdChildMapping")
    public String ch3(){
        return "third child";
    }

    @RequestMapping("/thirdChildMapping2")
    public String ch4(){
        return "third child2";
    }
}
