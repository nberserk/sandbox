package com.nberserk;

import com.google.gson.Gson;

/**
 * Created by darren on 2015. 7. 30..
 */
public class Main {

    static class Pojo{
        String name;
        int age;
    }

    public static void main(String[] args) {
        System.out.println("hello world");

        Pojo p = new Pojo();
        p.age = 30;
        p.name = "darren";

        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println(json);
    }
}
