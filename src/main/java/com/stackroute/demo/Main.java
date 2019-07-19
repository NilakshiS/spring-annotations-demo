package com.stackroute.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {

        //getting the context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        //getting the BeanLifecycleDemoBean bean
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean("beanLifecycle",BeanLifecycleDemoBean.class);

        //closing the context so that destroy methods are called
        context.close();

    }
}