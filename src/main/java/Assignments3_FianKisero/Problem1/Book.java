package Assignments3_FianKisero.Problem1;

public class Book extends LibraryItem {

    private String isbn;
    private String genre;

    public Book(String itemId, String title, String author, boolean isAvailable, String isbn, String genre) {
        super(itemId, title, author, isAvailable);
        this.isbn = isbn;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void checkout(boolean isAvailable) {
        if (isAvailable) {
            System.out.println("Book has been checked out");
        }
    }

    @Override
    public LibraryItem returnItem(String itemId) {
        return new Book(itemId, title, author, isAvailable, isbn, genre);

    }

    @Override
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Genre: " + genre);
    }
}
