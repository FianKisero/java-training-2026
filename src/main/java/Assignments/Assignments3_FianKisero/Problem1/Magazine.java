package Assignments.Assignments3_FianKisero.Problem1;

import java.time.LocalDate;

public class Magazine extends LibraryItem {

    protected int issueNumber;
    protected LocalDate publicationDate;

    public Magazine(String itemId, String title, String author, boolean isAvailable, int issueNumber, LocalDate publicationDate) {
        super(itemId, title, author, isAvailable);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public void checkout(boolean isAvailable) {
        if (isAvailable) {
            System.out.println("Magazine with ID " + itemId + " is available");
        }
    }

    @Override
    public LibraryItem returnItem(String itemId) {
        return null;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Date: " + getPublicationDate());
        System.out.println("Issue: " + getIssueNumber());
    }
}
