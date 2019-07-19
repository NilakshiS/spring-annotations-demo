package com.stackroute.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;


public class Movie {
    private Actor actor;

    //default constructor
    public Movie(){
    }

    //parameterised constructor
    public Movie(Actor actor) {
        this.actor = actor;
    }

    //setter
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //getter
    public Actor getActor() {
        return actor;
    }
}
