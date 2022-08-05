package com.selfedu.delivery.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping
@Slf4j
public class MainController {

    @GetMapping
    public ResponseEntity<String> main() {
        log.debug("enter");
        System.out.println("Entering main function");
        return ResponseEntity.ok().build();
    }
}
