package com.example.demo.configs

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {

    @Bean
    fun customOpenApi(): OpenAPI {
        return OpenAPI().info(
            Info().title("RESTful API with Kotlin and Spring Boot").version("v1").description("CRUD of Person")
        )
    }
}