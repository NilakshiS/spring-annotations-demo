package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
    private String name;
    private String gender;
    private int age;

    //default constructor
    Actor(){}

    //setters with default values for new beans
    @Value("cde")
    public void setName(String name) {
        this.name = name;
    }

    @Value("female")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Value("23")
    public void setAge(int age) {
        this.age = age;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    //parameterised constructor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //toString method
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
