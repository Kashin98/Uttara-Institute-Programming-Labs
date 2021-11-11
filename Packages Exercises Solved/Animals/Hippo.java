package com.kashin98.zoo;

public class Hippo extends Animal {

    public Hippo(String name) {
        super(name);
        System.out.println("In Hippo constructor - com.uttara.zoo");
    }

    public void sing(){
        System.out.println("Hippo sings");
    }
}