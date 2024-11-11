package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class webSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .authorizeHttpRequests(requests -> requests
            .requestMatchers("/", "/home").permitAll()
            .anyRequest().authenticated())
        .formLogin(form -> form
            .loginPage("/login")
            .permitAll())
        .logout(logout -> logout
            .permitAll());

    return http.build();
}



    @Bean
    public UserDetailsService userDetailsService() {
    	UserDetails user1 =User.withDefaultPasswordEncoder()
    			.username("user1")
    			.password("password1")
    			.roles("USER")
    			.build();
    	
    	UserDetails user2 =User.withDefaultPasswordEncoder()
    			.username("user2")
    			.password("password2")
    			.roles("ADMIN")
    			.build();
    	 return new InMemoryUserDetailsManager(user1, user2);
    }
    	
    }