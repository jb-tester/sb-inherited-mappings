package com.mytests.spring.sbactuatormappings.parentAnnotatedAsController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/annotatedParent")
public class ParentAnnotatedController {

    @GetMapping("/parentMapping")
    public ResponseEntity<String> parentMapping() {
        return ResponseEntity.ok("parentMapping");
    }
}
