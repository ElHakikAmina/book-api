package com.bushansirgur.spring.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.bushansirgur.sprin.controller"})
public class WebConfig extends WebMvcConfigurerAdapter{

	
}
