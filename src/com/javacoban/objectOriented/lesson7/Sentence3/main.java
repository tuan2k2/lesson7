package com.javacoban.objectOriented.lesson7.Sentence3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Enter document code:");
        book.setCodeDocument("113");
        System.out.println(book.getCodeDocument());
        System.out.println("Enter publishingCompany:");
        book.setPublishingCompany("Công Ty Tnhh Nhà Của Momo");
        System.out.println(book.getPublishingCompany());
        System.out.println("Enter releaseNumber");
        book.setReleaseNumber(22);
        System.out.println(book.getReleaseNumber());
        System.out.println("Enter author");
        book.setAuthor("Anh Tuấn");
        System.out.println(book.getAuthor());
        System.out.println("Enter numberOfPages:");
        book.setNumberOfPages(100);
        System.out.println(book.getNumberOfPages());
    }
}
