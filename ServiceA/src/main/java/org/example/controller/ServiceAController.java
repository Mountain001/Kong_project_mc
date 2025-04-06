package org.example.controller;

import jakarta.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {
    @Resource
    private Environment env;

    @GetMapping("/info")
    public String getInfo(){
        String port =  env.getProperty("local.server.port");
        return "您已经获取到服务，目前服务器端口为" + port;
    }


}
