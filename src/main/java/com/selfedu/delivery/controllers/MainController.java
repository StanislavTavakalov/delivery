package com.selfedu.delivery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@Controller
@Slf4j
public class MainController {

    @GetMapping("/greeting")
    public String main() {
        log.debug("enter");
        System.out.println("Entering main function");
        return "greeting";
    }
}
