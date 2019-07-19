package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor actor;
    private ApplicationContext applicationContext;
    private String beanName;
    private BeanFactory beanFactory;

    //default constructor
    public Movie(){
    }

    //parameterised constructor
    public Movie(Actor actor) {
        this.actor = actor;
    }

    //setter with autowiring
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //getter
    public Actor getActor() {
        return actor;
    }

    //method of BeanFactoryAware interface
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
        System.out.println("set bean factory method called");
    }

    //method of BeanNameAware interface
    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("set bean name method called, bean name is: "+beanName);
    }

    //method of ApplicationContextAware interface
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("set application context method called");
    }
}
