class BookDemo1 {

    String title;
    String author;
    double price;

    
    BookDemo1() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    
    BookDemo1(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {

        BookDemo1 b1 = new BookDemo1();
        BookDemo1 b2 = new BookDemo1("Java", "James", 599);

        b1.display();

        System.out.println();

        b2.display();
    }
}