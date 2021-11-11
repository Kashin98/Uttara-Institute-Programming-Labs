package com.kashin98.test;

import com.kashin98.zoo.*;

public class TestAnimal {
    public static void main(String[] args) {
        Hippo a = new Hippo("Kashin");
        a.sing();
        // this is possible because they are both in same package called zoo so package scope works.
        // It stops working when the package is changed because the package scope only allows classes inside package
        // to have access to the class member marked package access specifier
    }
}