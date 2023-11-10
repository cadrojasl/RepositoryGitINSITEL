package com.proyectos.springboot.web.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http://localhost:4200"); // Permitir solicitudes desde este origen
        config.addAllowedMethod("*"); // Permitir cualquier método (GET, POST, etc.)
        config.addAllowedHeader("*"); // Permitir cualquier encabezado
        source.registerCorsConfiguration("/**", config); // Aplicar la configuración a todas las rutas
        return new CorsFilter(source);
    }
}
