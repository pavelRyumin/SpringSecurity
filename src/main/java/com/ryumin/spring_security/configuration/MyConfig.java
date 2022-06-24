package com.ryumin.spring_secutity.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.ryumin.spring_security");
@EnableWebMvc
public class MyConfig {
}
