class LibraryBook {
    String title;
    int publicationYear;

    LibraryBook(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class LibraryAuthor extends LibraryBook {
    String name;
    String bio;

    LibraryAuthor(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book Title       : " + title);
        System.out.println("Publication Year : " + publicationYear);
        System.out.println("Author Name      : " + name);
        System.out.println("Author Bio       : " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        LibraryAuthor author = new LibraryAuthor(
                "Java Programming",
                2025,
                "James Gosling",
                "Father of Java"
        );

        author.displayInfo();
    }
}