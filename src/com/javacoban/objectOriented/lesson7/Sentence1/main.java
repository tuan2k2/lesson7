package com.javacoban.objectOriented.lesson7.Sentence1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker worker = new Worker() {
            @Override
            public void setFactory(String factory) {
                super.setFactory(factory);
            }
        };
        Officer officer = new Officer() {
            @Override
            public String getDepartment() {
                return super.getDepartment();
            }
        };
        System.out.println(" Enter name  Employee:");
        worker.setName(sc.nextLine());
        System.out.println(" Enter age:");
        worker.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("enter gender:");
        worker.setGender(sc.nextBoolean());
        sc.nextLine();
        System.out.println("enter address:");
        worker.setAddress(sc.nextLine());
        System.out.println("enter level:");
        officer.setLevel(sc.nextInt());
        sc.nextLine();
        System.out.println("Wage:");
        System.out.println(officer.calculateSalary());
    }
}