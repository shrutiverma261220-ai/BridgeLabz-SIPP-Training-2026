public class LibraryBookSystem {

    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized Constructor
    LibraryBookSystem(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Display book details
    void displayDetails() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : ₹" + price);
        System.out.println("Availability : " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {

        LibraryBookSystem book = new LibraryBookSystem(
                "Java Programming",
                "James Gosling",
                599,
                true
        );

        System.out.println("Book Details:");
        book.displayDetails();

        System.out.println("\nBorrowing Book...");
        book.borrowBook();

        System.out.println("\nUpdated Book Details:");
        book.displayDetails();
    }
}