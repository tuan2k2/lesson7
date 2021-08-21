package com.javacoban.objectOriented.lesson7.Sentence2;

import com.javacoban.objectOriented.lesson7.Sentence1.Employee;

public class main {
    public static void main(String[] args) {
        Engineer employee = new Engineer();
        System.out.println("Enter first and last name:");
        employee.setName("Trần Anh Tuấn ");
        System.out.println(employee.getName());
        System.out.println("Enter gender (if male , enter true , else enter false  ) ");
        employee.setGender(true);
        System.out.println(employee.isGender());
        System.out.println("Enter Age:");
        employee.setAge(19);
        System.out.println(employee.getAge());
        System.out.println("Enter address:");
        employee.setAddress("hồng thủy , lệ thủy , quảng bình ");
        System.out.println(employee.getAddress());
        System.out.println("Enter majors:");
        employee.setMajor("công nghệ thông tin");
        System.out.println(employee.getMajor());
        System.out.println("Enter level:");
        employee.setLevel(15);
        System.out.println(employee.getLevel());
        System.out.println("Wage:" + employee.getWage());
    }
}
