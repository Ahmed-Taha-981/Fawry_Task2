import java.util.*;

public class Inventory {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Quantum book store: Book added: " + book.getTitle());
    }

    public List<Book> removeOutdatedBooks(int currentYear, int maxAge) {
        List<Book> removed = new ArrayList<>();
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (currentYear - b.getYear() > maxAge) {
                removed.add(b);
                it.remove();
                System.out.println("Quantum book store: Removed outdated book: " + b.getTitle());
            }
        }
        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn) && b.isForSale()) {
                if (b instanceof PaperBook) {
                    PaperBook pb = (PaperBook) b;
                    if (pb.getStock() < quantity) {
                        throw new Exception("Quantum book store: Not enough stock for PaperBook");
                    }
                    pb.reduceStock(quantity);
                    System.out.println("Quantum book store: ShippingService called for address: " + address);
                    return pb.getPrice() * quantity;
                } else if (b instanceof EBook) {
                    System.out.println("Quantum book store: MailService called for email: " + email);
                    return b.getPrice() * quantity;
                }
            }
        }
        throw new Exception("Quantum book store: Book not found or not for sale");
    }

    public void printInventory() {
        System.out.println("Quantum book store: Inventory:");
        for (Book b : books) {
            System.out.println("  - " + b.getTitle() + " (" + b.getIsbn() + ") by " + b.getAuthorName());
        }
    }
} 