package com.nberserk.spring.example;

/**
 * Created by darren on 2016. 1. 14..
 */
public class Greeting {
    String name;
    int age;

    Greeting(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public String getName() {
        return name;
    }
}
