package lab5;

public class TestBook {
    public static void main(String[] args) {
        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // oop.Author's toString()

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test oop.Book's Constructor
        System.out.println(dummyBook);  // Test oop.Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("oop.Author is: " + dummyBook.getAuthor());  // oop.Author's toString()
        System.out.println("oop.Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("oop.Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of oop.Author to construct a oop.Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
    }
}
