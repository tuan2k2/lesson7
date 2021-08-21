package com.javacoban.objectOriented.lesson7.Sentence3;
public class Book extends Document {
    private String author;
    private int numberOfPages;

    public Book(String codeDocument, String publishingCompany, int releaseNumber, String author, int numberOfPages) {
        super(codeDocument, publishingCompany, releaseNumber);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
