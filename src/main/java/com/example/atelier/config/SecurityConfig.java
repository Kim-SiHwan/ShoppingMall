package com.example.atelier.config;

import com.example.atelier.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Log
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/shop/main").permitAll()
                .antMatchers("/shop/imgList").permitAll()
                .antMatchers("/shop/view").permitAll()
                .antMatchers("/shop/admin_order_confirm").hasRole("ADMIN")
                .antMatchers("/h2/*").permitAll()
                .antMatchers("/review/**").permitAll()
                .antMatchers("/qna/**").permitAll();
        http.csrf()
                .ignoringAntMatchers("/review/**")
                .ignoringAntMatchers("/qna/**")
                .ignoringAntMatchers("/shop/imgList")
                .ignoringAntMatchers("/h2/**")
                .ignoringAntMatchers("/shop/join");
        http.headers().frameOptions().disable();
        http.formLogin().defaultSuccessUrl("/shop/main");
        http.logout().logoutSuccessUrl("/shop/main");

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
