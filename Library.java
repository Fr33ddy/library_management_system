import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        Book newBook = new Book(title, author, true);
        books.add(newBook);
        System.out.println("Book added successfully.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void borrowbook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You have successfully borrowed: " + title);
                } else {
                    System.out.println("Sorry, the book is currently borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("You have successfully returned: " + title);
                } else {
                    System.out.println("This book wasn't borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
}
