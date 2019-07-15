package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie{
    Actor actor;


    public Movie(Actor actor){this.actor = actor;}

    public Movie(){}

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
        //System.out.println("setActor called");
    }

    public Actor getActor() {
        return actor;
    }
}
