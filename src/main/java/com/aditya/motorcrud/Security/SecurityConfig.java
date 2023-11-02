package com.aditya.motorcrud.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {


    /*
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
                .roles("ADMIN","MANAGER")
                .build();
        return new InMemoryUserDetailsManager(shekar,customer);

    }

     */



    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }




    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers("/motors/list").hasRole("CUSTOMER")
                        .requestMatchers("/motors/showFormForUpdate").hasRole("MANAGER")
                        .requestMatchers("/motors/delete").hasRole("ADMIN")
                        .anyRequest().authenticated()
        ).formLogin(form ->
                        form
                                .loginPage("/showLoginPage")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll()
                ).logout(logout -> logout.permitAll()
                )
                .exceptionHandling(configurer -> configurer.accessDeniedPage("/access-denied"));
        return http.build();
    }



}
