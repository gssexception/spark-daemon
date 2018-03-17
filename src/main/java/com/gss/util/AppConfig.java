package com.gss.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.InputMismatchException;

/**
 * Created by DG on 26.01.2017.
 */
@Configuration
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter{
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver InternalResourceViewResolver = new InternalResourceViewResolver();
        InternalResourceViewResolver.setPrefix("/");
        InternalResourceViewResolver.setSuffix(".jsp");
        return InternalResourceViewResolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
