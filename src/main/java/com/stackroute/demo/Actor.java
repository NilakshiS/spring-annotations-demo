package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Actor {
    private String name;
    private String gender;
    private int age;

    //default constructor
    Actor(){}

    //setters
    public void setName(String name) {
        this.name = name;
        //System.out.println("setName called");
    }

    public void setGender(String gender) {
        this.gender = gender;
        //System.out.println("setGender called");
    }

    public void setAge(int age) {
        this.age = age;
        //System.out.println("setAge called");
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
