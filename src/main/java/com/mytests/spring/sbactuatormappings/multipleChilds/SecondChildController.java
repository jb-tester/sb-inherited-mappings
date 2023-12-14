package com.mytests.spring.sbactuatormappings.multipleChilds;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 12/14/2023.</p>
 * <p>Project: sb-inherited-mappings</p>
 * *
 */
@RestController
public class SecondChildController extends ParentControllerWith3Childs
{
    @RequestMapping("/multiple/secondChildMapping")
    public String ch2(){
        return "second child";
    }
}
