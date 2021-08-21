package com.javacoban.objectOriented.lesson7.Sentence1;

public class Worker extends Employee {
    private String factory;

    public Worker(String name, boolean gender, int age, String address, String factory) {
        super(name, gender, age, address);
        this.factory = factory;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}