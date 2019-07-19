package com.stackroute.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {

        //getting the context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        //getting the movie bean
        Movie movie = context.getBean("movie",Movie.class);
        System.out.println(movie.getActor().getName());
        System.out.println(movie.getActor().getAge());
        System.out.println(movie.getActor().getGender());

    }
}