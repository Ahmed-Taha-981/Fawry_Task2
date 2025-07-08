public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String authorName, int stock) {
        super(isbn, title, year, price, authorName);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        this.stock -= quantity;
    }

    @Override
    public boolean isForSale() {
        return true;
    }
} 