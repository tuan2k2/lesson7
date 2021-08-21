package com.javacoban.objectOriented.lesson7.ex;

import com.javacoban.objectOriented.lesson7.ex.cattle;

public class Dog extends cattle {
       private String origin;
       private String color;

       public Dog(String name, boolean genDer, int age, String origin, String color) {
           super(name, genDer, age);
           this.origin = origin;
           this.color = color;
       }
   }