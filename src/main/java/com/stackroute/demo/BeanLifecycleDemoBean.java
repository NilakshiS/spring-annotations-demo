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

    //method in InitialisingBean interface
    @Override
    public void afterPropertiesSet() {
        System.out.println("after properties set method called before bean is initialized and after properties set");
    }

    //PostConstruct annotation for custom init
    @PostConstruct
    public void customInit(){
        System.out.println("Custom init called");
    }

    //PreDestroy annotation for custom destroy
    @PreDestroy
    public void customDestroy(){
        System.out.println("Custom destroy called");
    }
}

