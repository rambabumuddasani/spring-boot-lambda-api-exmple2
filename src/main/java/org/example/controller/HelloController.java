package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/h1")
    public ResponseEntity<MessageDto>  greet(){
        return ResponseEntity.ok(new MessageDto("hi"));
    }
}
