package com.javacoban.objectOriented.lesson7.Sentence1;

public class Worker extends Employee {
    private String factory;

    public Worker(String name, boolean gender, int age, String address, String factory) {
        super(name, gender, age, address);
        this.factory = factory;
    }

    public Worker() {
    }

    @Override
    public double calculateSalary() {
        return 3*10e6;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}