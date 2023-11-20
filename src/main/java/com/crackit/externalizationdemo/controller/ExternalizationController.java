package com.crackit.externalizationdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crackit/demo/")
public class ExternalizationController {

    @Value("${crackit.message}")
    private String message;

    @GetMapping("/externalization")
    public String getMessageFromProfile() {
        return message;
    }

}
