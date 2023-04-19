package com.example.ApiGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public RouteLocator myRoute(RouteLocatorBuilder builder)
    {
        return builder.routes()
                .route(p->p
                        .path("/api/customer/v1/**")
                        .uri("lb://auth-service"))
                .route(p->p
                        .path("/api/v1/**")
                        .uri("lb://product-service"))
                .build();
    }
}
