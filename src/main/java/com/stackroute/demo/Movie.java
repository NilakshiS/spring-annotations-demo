package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie{
    private Actor actor;

    //setter autowired
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("setActor called");
    }

    //getter
    public Actor getActor() {
        return actor;
    }
}
