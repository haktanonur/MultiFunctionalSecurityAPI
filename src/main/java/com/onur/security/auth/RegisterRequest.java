package com.onur.security.auth;

import com.onur.security.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private Role role;
}
