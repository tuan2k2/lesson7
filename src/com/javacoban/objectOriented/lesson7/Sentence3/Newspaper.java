package com.javacoban.objectOriented.lesson7.Sentence3;

public class Newspaper extends Document{
    private int releaseDate;

    public Newspaper(String codeDocument, String publishingCompany, int releaseNumber, int releaseDate) {
        super(codeDocument, publishingCompany, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
