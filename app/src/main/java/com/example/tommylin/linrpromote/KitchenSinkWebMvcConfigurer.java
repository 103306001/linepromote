package com.example.tommylin.linrpromote;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class KitchenSinkWebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        String downloadedContentUri = KitchenSinkApplication.downloadedContentDir
                .toUri().toASCIIString();
        registry.addResourceHandler("/downloaded/**")
                .addResourceLocations(downloadedContentUri);
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}