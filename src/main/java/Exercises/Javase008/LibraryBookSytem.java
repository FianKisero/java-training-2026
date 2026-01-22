

package Exercises.Javase008;

import java.time.LocalDate;


public class LibraryBookSytem {
    private final String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private LocalDate dueDate;

    public LibraryBookSytem(String isbn, String title, String author) {
        validateIsbn(isbn);
        validateStringInput(title, "Title");
        validateStringInput(author, "Author");

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    private void validateIsbn(String isbn) {
        if (isbn == null || !isbn.matches("\\d{13}")) {
            throw new IllegalArgumentException("ISBN must be exactly 13 digits.");
        }
    }

    private void validateStringInput(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " cannot be empty or null.");
        }
    }

    public void borrowBook(int loanDays) {
        if (!isAvailable) {
            throw new IllegalStateException("Book is already out on loan.");
        }
        this.isAvailable = false;
        this.dueDate = LocalDate.now().plusDays(loanDays);
    }

    public void returnBook() {
        this.isAvailable = true;
        this.dueDate = null;
    }

    public boolean isOverdue() {
        // Safe check for null dueDate
        if (isAvailable || dueDate == null) {
            return false;
        }
        return LocalDate.now().isAfter(dueDate);
    }

    public void displayDetails() {
        System.out.println("Title: " + title + " | Author: " + author);
        if (isAvailable) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Borrowed | Due: " + dueDate);
        }
    }

    // Getters and Setters
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public LocalDate getDueDate() { return dueDate; }
    public String getTitle() { return title; }

    public void setTitle(String title) {
        validateStringInput(title, "Title");
        this.title = title;
    }

    public String getAuthor() { return author; }

    public void setAuthor(String author) {
        validateStringInput(author, "Author");
        this.author = author;
    }
}
