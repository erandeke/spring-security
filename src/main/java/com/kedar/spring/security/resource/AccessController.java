package com.kedar.spring.security.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessController {


    @GetMapping("/user")
    public String getUserDetails() {
        return ("<h1>User logged in <h1>");
    }

    @GetMapping("/admin")
    public String adminControlled() {
        return ("<h1>Welcome admin</h1>");
    }

    @GetMapping("/")
    public String homePage() {
        return ("<h1>Welcome to my app </h1>");
    }
}
