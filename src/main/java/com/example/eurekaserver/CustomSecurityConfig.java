package com.example.eurekaserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 自定义
 */
@Configuration
@EnableWebSecurity
public class CustomSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //关闭csrf
        http.csrf().disable();

        http.authorizeRequests().
                anyRequest().
                authenticated(). //表示任何请求都要经过认证后才能访问
                and().
                formLogin(). //开启表单认证方式
                and().
                httpBasic(); //支持Http Basic认证
    }
}
