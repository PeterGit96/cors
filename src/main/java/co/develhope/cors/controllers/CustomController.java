package co.develhope.cors.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomController {

    @GetMapping("/custom")
    public String welcome() {
        return "Hello, thanks for visiting us!";
    }

}