package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie{
    private Actor actor;

    //parameterised constructor
    public Movie(Actor actor){this.actor = actor;}

    //default constructor
    public Movie(){}

    //setter with autowiring
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
        //System.out.println("setActor called");
    }

    //getter
    public Actor getActor() {
        return actor;
    }
}
