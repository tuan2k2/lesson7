package com.javacoban.objectOriented.lesson7.Sentence1;

public class Officer extends Employee {
  private String department;
  private String level;

    public Officer(String name, boolean gender, int age, String address, String department, String level) {
        super(name, gender, age, address);
        this.department = department;
        this.level = level;
    }

    public Officer() {
    }

    public Officer(String department, String level) {
        this.department = department;
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
