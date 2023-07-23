package com.anyaudit.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.customizers.OpenApiCustomiser;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenApiCustomiser customSecurityConfiguration() {
        return openApi -> {
            SecurityScheme securityScheme = new SecurityScheme()
                    .name("Authorization")
                    .type(SecurityScheme.Type.HTTP)
                    .scheme("bearer")
                    .bearerFormat("JWT");

            openApi.components(new Components().addSecuritySchemes("bearerAuth", securityScheme));

            openApi.addSecurityItem(new SecurityRequirement().addList("bearerAuth"));
        };
    }
}
