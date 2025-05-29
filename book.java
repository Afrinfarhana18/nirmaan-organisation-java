package library2;

public class book {

    private int id;
    private String title;
    private String author;
    private double price;

    // Default constructor
    public book() {
        super();
    }

    // Parameterized constructor
    public book(int id, String title, String author, double price) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}


