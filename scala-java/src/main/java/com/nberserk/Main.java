package com.nberserk;

import com.nberserk.scala.App;

public class Main {
    public static void main(String[] args) {

        App.hello();

        String s = App.foo(new String[]{"a", "b", "darren"});
        System.out.println(s);
    }
}

