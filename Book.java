
public class Book implements Cloneable {
    private string title;
    private string author;
    private float price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    // Constructor with 2 parameters
    public Book(string title, string author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    // Constructor with 3 parameters
    public Book(string title, string author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public string toString() {
        return "Title - " + title + "\nAuthor - " + author + "\nPrice - " + price;
    }
}