package com.courseapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/greets")
    public String getName() {
        return "Hi Akash";
    }
}
