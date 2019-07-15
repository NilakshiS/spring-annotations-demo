package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Actor {
    String name;
    String gender;
    int age;
    Actor(){}

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

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
