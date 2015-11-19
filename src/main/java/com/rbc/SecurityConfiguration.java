package com.rbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("julia").password("password").roles("USER"); // ... etc.*//*
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Dis  able CSRF
        // TODO find a way to allow CSRF for everything but API
        http.csrf().disable();

/*        // System stuff
        http.authorizeRequests()//
                .antMatchers("/favicon.ico").permitAll();

        // Pages
        http.authorizeRequests()//
                .antMatchers("/v1*//**").permitAll()//
                .antMatchers("/v2*//**").permitAll()//
                .antMatchers("/v3*//**").permitAll()//
                .antMatchers("/v4*//**").permitAll()//
                .antMatchers("/v5*//**").permitAll()//
                // disallow everything else...
                .anyRequest().authenticated();

        http.formLogin()//
                .defaultSuccessUrl("/admin/news")//
                .loginPage("/login")//
                .permitAll();

        http.logout().permitAll();*/
    }

}