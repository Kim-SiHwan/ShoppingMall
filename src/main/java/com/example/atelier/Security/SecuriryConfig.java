package com.example.atelier.Security;

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
public class SecuriryConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/shop/main").permitAll()
                .antMatchers("/shop/imgList").permitAll()
                .antMatchers("/shop/view").permitAll()
                .antMatchers("/h2/*").permitAll();
        http.csrf()
                .ignoringAntMatchers("/review/**")
                .ignoringAntMatchers("/shop/imgList")
                .ignoringAntMatchers("/h2/**");
        http.headers().frameOptions().disable();
        http.formLogin().defaultSuccessUrl("/shop/main");
        http.logout().logoutSuccessUrl("/shop/main");

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
        log.info("asdf" + auth.userDetailsService(userService).getUserDetailsService());
    }

}
