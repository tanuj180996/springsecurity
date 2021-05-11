package com.tanuj.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests().
                antMatchers("/comments").authenticated()
                .antMatchers("/contacts").authenticated()
                .antMatchers("/balance").permitAll().
                and().
                formLogin().
                and().
                httpBasic();

    }
}
