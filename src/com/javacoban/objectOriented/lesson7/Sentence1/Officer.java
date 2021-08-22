package com.javacoban.objectOriented.lesson7.Sentence1;

public  class Officer extends Employee {
  private String department;
  private double level;

    public Officer(String name, boolean gender, int age, String address, String department, double level) {
        super(name, gender, age, address);
        this.department = department;
        this.level = level;
    }

    public Officer() {
    }

    @Override
    public double calculateSalary() {
        return level*3.5*10e6;
    }

    public Officer(String department, double level) {
        this.department = department;
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getLevel(double a , double b) {
        a=10;
        b=6;
        return level*3*Math.pow(a,b);
    }

    public void setLevel(double level) {
        this.level = level;
    }
}
