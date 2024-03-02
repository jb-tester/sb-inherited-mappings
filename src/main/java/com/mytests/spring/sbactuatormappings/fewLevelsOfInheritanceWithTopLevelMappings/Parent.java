package com.mytests.spring.sbactuatormappings.fewLevelsOfInheritanceWithTopLevelMappings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/parent")
public interface Parent extends GrandParent {
}
