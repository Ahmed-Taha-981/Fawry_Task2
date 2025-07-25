public abstract class Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String authorName;

    public Book(String isbn, String title, int year, double price, String authorName) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public abstract boolean isForSale();
} 