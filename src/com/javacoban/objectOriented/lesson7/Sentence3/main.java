package com.javacoban.objectOriented.lesson7.Sentence3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter document code:");
        book.setCodeDocument(sc.nextLine());
        System.out.println("Enter publishingCompany:");
        book.setPublishingCompany(sc.nextLine());
        System.out.println("Enter releaseNumber");
        book.setReleaseNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter author");
        book.setAuthor(sc.nextLine());
        System.out.println("Enter numberOfPages:");
        book.setNumberOfPages(sc.nextInt());
    }
}
