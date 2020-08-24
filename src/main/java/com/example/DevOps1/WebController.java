package com.example.DevOps1;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController extends SpringBootServletInitializer {

    @Override
    @RequestMapping("/")
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DevOps1Application.class);
    }

}
