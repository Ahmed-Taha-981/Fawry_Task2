public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // use case 1: Add books
        PaperBook pb = new PaperBook("ISBN001", "Shadow Slave", 2022, 100.0, "Guiltythree", 5);
        EBook eb = new EBook("ISBN002", "The beginning after the end", 2017, 50.0, "TurtleMe", "PDF");
        ShowcaseBook sb = new ShowcaseBook("ISBN003", "One Piece", 1997, 0.0, "Eiichiro Oda");

        inventory.addBook(pb);
        inventory.addBook(eb);
        inventory.addBook(sb);

        inventory.printInventory();

        // use case 2: Remove outdated books
        inventory.removeOutdatedBooks(2025, 10);
        inventory.printInventory();

        // use case 3: Buy a paper book
        try {
            double paid = inventory.buyBook("ISBN001", 2, "buyer@email.com", "123 Main St");
            System.out.println("Quantum book store: Paid amount: " + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // use case 4: Buy an ebook
        try {
            double paid = inventory.buyBook("ISBN002", 1, "buyer@email.com", "");
            System.out.println("Quantum book store: Paid amount: " + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // use case 5: Try to buy a showcase book
        try {
            inventory.buyBook("ISBN003", 1, "buyer@email.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
} 