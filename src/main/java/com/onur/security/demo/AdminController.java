package com.onur.security.demo;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
@Tag(name = "Admin")
public class AdminController {

    @GetMapping
    @PreAuthorize("hasAuthority('admin:read')")
    @Operation(
            description = "Get endpoint for admin",
            summary = "This is a summary for admin get endpoint"
    )
    public String get(){
        return "GET:: Admin Controller";
    }

    @PostMapping
    @PreAuthorize("hasAuthority('admin:create')")
    @Operation(
            description = "Post endpoint for admin",
            summary = "This is a summary for admin post endpoint"
    )
    @Hidden
    public String post(){
        return "POST:: Admin Controller";
    }

    @PutMapping
    @PreAuthorize("hasAuthority('admin:update')")
    @Operation(
            description = "Put endpoint for admin",
            summary = "This is a summary for admin put endpoint"
    )
    @Hidden
    public String put(){
        return "PUT:: Admin Controller";
    }

    @DeleteMapping
    @PreAuthorize("hasAuthority('admin:delete')")
    @Operation(
            description = "Delete endpoint for admin",
            summary = "This is a summary for admin delete endpoint"
    )
    @Hidden
    public String delete(){
        return "DELETE:: Admin Controller";
    }
}
