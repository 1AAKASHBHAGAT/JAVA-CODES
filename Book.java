
public class Book implements Cloneable {
    private String title;
    private String author;
    private float price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    // Constructor with 2 parameters
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    // Constructor with 3 parameters
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Title - " + title + "\nAuthor - " + author + "\nPrice - " + price;
    }
}