package com.mytests.spring.sbactuatormappings.parentClassWithMethodsAndTopLevelMapping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController extends Foo {

    @GetMapping("/child_method/first")
    public ResponseEntity<String> getString() {
        return ResponseEntity.ok("");
    }
}
