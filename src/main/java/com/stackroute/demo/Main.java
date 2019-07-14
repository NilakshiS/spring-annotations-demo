package com.stackroute.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie = context.getBean(Movie.class);
        System.out.println(movie.getActor().getName());
        System.out.println(movie.getActor().getAge());
        System.out.println(movie.getActor().getGender());

    }
}