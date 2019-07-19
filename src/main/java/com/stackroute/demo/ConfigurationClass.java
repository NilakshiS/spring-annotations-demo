package com.stackroute.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ConfigurationClass {

    //BeanLifecycleDemoBean bean
    @Bean
    public BeanLifecycleDemoBean beanLifecycle(){
        return new BeanLifecycleDemoBean();
    }
}
