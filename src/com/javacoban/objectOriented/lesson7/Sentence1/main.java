package com.javacoban.objectOriented.lesson7.Sentence1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(" Enter name  Employee:");
        employee.setName("Trần Anh tuấn");
        System.out.println(employee.getName());
        System.out.println(" Enter age:");
        employee.setAge(19);
        System.out.println(employee.getAge());
        System.out.println("enter gender:");
        employee.setGender(true);
        System.out.println(employee.isGender());
        System.out.println("enter address:");
        employee.setAddress("Hồng Thủy , lệ Thủy , Quảng Bình ");
        System.out.println(employee.getAddress());
    }
}