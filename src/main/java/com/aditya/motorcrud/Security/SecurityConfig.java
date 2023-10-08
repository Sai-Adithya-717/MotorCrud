package com.aditya.motorcrud.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
    //using JDBC support
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET,"api/motors").hasRole("CUSTOMER")
                        .requestMatchers(HttpMethod.GET,"api/motors/**").hasRole("CUSTOMER")
                        .requestMatchers(HttpMethod.POST,"api/motors").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT,"api/motors").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE,"api/motors/**").hasRole("ADMIN")
        );
        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf ->csrf.disable());

        return http.build();
    }
    /* //for Creating user details manually
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails customer = User.builder()
                .username("Customer")
                .password("{noop}Customer123")
                .roles("CUSTOMER")
                .build();
        UserDetails shekar = User.builder()
                .username("Shekar")
                .password("{noop}Shekar123")
                .roles("ADMIN","MANAGER","CUSTOMER")
                .build();
    return new InMemoryUserDetailsManager(shekar,customer);

    }
*/
}
