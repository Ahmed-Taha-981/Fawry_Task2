public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String authorName, String fileType) {
        super(isbn, title, year, price, authorName);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    @Override
    public boolean isForSale() {
        return true;
    }
} 