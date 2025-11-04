package com.arka.MSEureka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Deshabilita la protección CSRF para las rutas de Eureka (si es un microservicio)
                .csrf(csrf -> csrf.ignoringRequestMatchers("/eureka/**"))

                // Requiere autenticación para cualquier solicitud
                .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())

                // Habilita la autenticación HTTP Basic por defecto
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}

