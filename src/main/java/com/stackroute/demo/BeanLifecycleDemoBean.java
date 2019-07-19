package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    //method in DisposableBean interface
    @Override
    public void destroy() {
        System.out.println("destroy method called before bean is destroyed");
    }

    //method in InitializingBean interface
    @Override
    public void afterPropertiesSet() {
        System.out.println("after properties set method called before bean is initialized and after properties set");
    }

    //custom init method using PostConstruct annotation
    @PostConstruct
    public void customInit(){
        System.out.println("Custom init called");
    }

    //custom destroy method using PreDestroy annotation
    @PreDestroy
    public void customDestroy(){
        System.out.println("Custom destroy called");
    }
}

