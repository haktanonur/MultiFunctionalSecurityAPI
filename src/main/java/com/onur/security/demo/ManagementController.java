package com.onur.security.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
@Tag(name = "Management")
public class ManagementController {

    @GetMapping
    @Operation(
            description = "Get endpoint for manager",
            summary = "This is a summary for manager get endpoint"
    )
    public String get(){
        return "GET:: Manager Controller";
    }

    @PostMapping
    @Operation(
            description = "Post endpoint for manager",
            summary = "This is a summary for manager post endpoint"
    )
    public String post(){
        return "POST:: Manager Controller";
    }

    @PutMapping
    @Operation(
            description = "Put endpoint for manager",
            summary = "This is a summary for manager put endpoint"
    )
    public String put(){
        return "PUT:: Manager Controller";
    }

    @DeleteMapping
    @Operation(
            description = "Delete endpoint for manager",
            summary = "This is a summary for manager delete endpoint"
    )
    public String delete(){
        return "DELETE:: Manager Controller";
    }
}
