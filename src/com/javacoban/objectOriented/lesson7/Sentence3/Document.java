package com.javacoban.objectOriented.lesson7.Sentence3;

public class Document {
    private String codeDocument;
    private String publishingCompany;
    private int releaseNumber;

    public Document(String codeDocument, String publishingCompany, int releaseNumber) {
        this.codeDocument = codeDocument;
        this.publishingCompany = publishingCompany;
        this.releaseNumber = releaseNumber;
    }

    public Document() {
    }

    public String getCodeDocument() {
        return codeDocument;
    }

    public void setCodeDocument(String codeDocument) {
        this.codeDocument = codeDocument;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }
}
