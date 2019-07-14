package com.stackroute.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean("beanLifecycle",BeanLifecycleDemoBean.class);
        context.close();

    }
}