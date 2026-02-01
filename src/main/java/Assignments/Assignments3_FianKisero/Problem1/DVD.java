package Assignments.Assignments3_FianKisero.Problem1;

public class DVD extends LibraryItem {

    private String duration;
    private int rating;

    public DVD(String itemId, String title, String author, boolean isAvailable, String duration, int rating) {
        super(itemId, title, author, isAvailable);
        this.duration = duration;
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void checkout(boolean isAvailable) {
        if (isAvailable) {
            displayDetails();
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
        System.out.println("Rating: " + getRating());
        System.out.println("Duration: " + getDuration());
    }
}
