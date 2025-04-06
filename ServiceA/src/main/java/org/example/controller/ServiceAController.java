package org.example.controller;

import jakarta.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {
    @Resource
    private Environment env;

    @GetMapping("/port")
    public String getPort(){
        return env.getProperty("local.server.port");
    }


}
