package com.yuan.config;

import com.yuan.component.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/","/login","/index","/asserts/**","**/*.ico","/webjars/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/success").setViewName("dashboard");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("login");
    }
}
