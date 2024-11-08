package com.example.helloworld;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello-world")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("tr")
    public ResponseEntity<String> sayHelloTR() {
        return ResponseEntity.ok("Merhaba Dünya!");
    }

    @GetMapping("jp")
    public ResponseEntity<String> sayHelloJP() {
        return ResponseEntity.ok("Konnichiwa Sekai!!");
    }
}
