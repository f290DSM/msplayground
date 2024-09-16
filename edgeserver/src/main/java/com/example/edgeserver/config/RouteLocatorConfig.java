package com.example.edgeserver.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;


@Component
public class RouteLocatorConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(r -> r.path("/clientes/**").uri("lb://msclientes"))
                .build();
    }
}
