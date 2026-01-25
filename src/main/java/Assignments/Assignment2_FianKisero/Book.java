

package Assignments.Assignment2_FianKisero;

import java.time.LocalDate;


public class Book {
    private final String isbn;
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    private LocalDate dueDate;

    // Constructor
    public Book(String isbn, String title, String author, double price) {
        validateIsbn(isbn);
        validateStringInput(title, "Title");
        validateStringInput(author, "Author");
        setPrice(price);

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.dueDate = null;
    }

    // Validation methods
    private void validateIsbn(String isbn) {
        if (isbn == null || !isbn.matches("\\d{13}")) {
            throw new IllegalArgumentException("ISBN must be exactly 13 digits.");
        }
    }

    private void validateStringInput(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty.");
        }
    }

    // Business methods
    public void borrowBook(int loanDays) {
        if (!isAvailable) {
            System.out.println("Book is already out on loan.");
        }
        isAvailable = false;
        dueDate = LocalDate.now().plusDays(loanDays);
    }

    public void returnBook() {
        if (isAvailable) {
            System.out.println("Book is already available.");
        } else {
            isAvailable = true;
            dueDate = null;
            System.out.println("Book returned successfully.");
        }
    }

    public boolean isOverdue() {
        if (isAvailable || dueDate == null) {
            return false;
        }
        return LocalDate.now().isAfter(dueDate);
    }

    // Getters and setters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateStringInput(title, "Title");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        validateStringInput(author, "Author");
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    // toString
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", dueDate=" + dueDate +
                '}';
    }
}
