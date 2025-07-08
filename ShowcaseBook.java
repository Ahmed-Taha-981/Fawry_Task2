public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, double price, String authorName) {
        super(isbn, title, year, price, authorName);
    }

    @Override
    public boolean isForSale() {
        return false;
    }
} 