package com.kgisl.task;

/**
 * Child
 */
public class Child extends Parent {

    public Child() {
        System.out.println("Constructor of child class");
    }

    static {
        System.out.println("Static block of child class ");
    }
    {
        System.out.println("Initialisation block of child class");
    }

    public static void main(String[] args) {
        Child c = new Child();

    }
}