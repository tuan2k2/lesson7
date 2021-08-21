package com.javacoban.objectOriented.lesson7.Sentence2;

import com.javacoban.objectOriented.lesson7.Sentence1.Employee;

public class Engineer extends Employee {
   private String major;
   private int level;
   private double wage;

    public Engineer(String name, boolean gender, int age, String address, String major, int level , double wage) {
        super(name, gender, age, address);
        this.major = major;
        this.level = level;
        this.wage = wage;
    }
    public Engineer(){

    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getWage() {
        double a=6;
        double b=10;
        return level*2.5*Math.pow(b,a) ;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
