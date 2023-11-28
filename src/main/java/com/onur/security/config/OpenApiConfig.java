package com.onur.security.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;


@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Onur Haktan",
                        email = "onurhaktann@gmail.com",
                        url = "https://onurhaktan.vercel.app/"
                ),

                description = "Implementation of security using Spring Boot 3.0 and JSON Web Tokens (JWT)",
                title = "OpenApi documentation for Spring Security",
                version = "1.0"),

                security = {
                        @SecurityRequirement(
                                name = "bearerAuth"
                        )
                }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "Connect to get JWT token",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {

}


