package com.kgisl.task;

/**
 * Parent
 */
public class Parent {

    public Parent() {
        System.out.println("Constructor of parent class");
    }

    static {
        System.out.println("Static block of parent class ");
    }
    {
        System.out.println("Initialisation block of parent class");
    }
}