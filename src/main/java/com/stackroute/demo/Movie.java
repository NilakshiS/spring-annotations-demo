package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie{
    Actor actor;

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("setActor called");
    }

    public Actor getActor() {
        return actor;
    }
}
