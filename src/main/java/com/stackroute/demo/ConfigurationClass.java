package com.stackroute.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

    //Actor bean
    @Bean
    public Actor actor(){
        return new Actor("cde","female",23);
    }

    //Movie bean
    @Bean
    public Movie movie(){
        return new Movie(actor());
    }
}
