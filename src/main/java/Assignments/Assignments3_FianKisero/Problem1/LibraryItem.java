package Assignments.Assignments3_FianKisero.Problem1;


public abstract class LibraryItem {

    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String itemId, String title, String author, boolean isAvailable) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public abstract void checkout(boolean isAvailable);
    public abstract LibraryItem returnItem(String itemId);
    public abstract void displayDetails();
}
