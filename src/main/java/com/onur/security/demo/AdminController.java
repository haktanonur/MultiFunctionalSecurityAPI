package com.onur.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping
    public String get(){
        return "GET:: Admin Controller";
    }

    @PostMapping
    public String post(){
        return "POST:: Admin Controller";
    }

    @PutMapping
    public String put(){
        return "PUT:: Admin Controller";
    }

    @DeleteMapping
    public String delete(){
        return "DELETE:: Admin Controller";
    }
}
