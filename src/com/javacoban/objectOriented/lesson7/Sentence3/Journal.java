package com.javacoban.objectOriented.lesson7.Sentence3;

public class Journal extends Document{
    private int issueNumber;
    private int releaseMonth;

    public Journal(String codeDocument, String publishingCompany, int releaseNumber, int issueNumber, int releaseMonth) {
        super(codeDocument, publishingCompany, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }
}
