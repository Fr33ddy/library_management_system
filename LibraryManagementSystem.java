import java.util.Scanner;

public class LibraryManagementSystem {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();
		library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("Blossoms of the Savannah", "Henry Ole Kulet");
		
        boolean exit = false;

        while (!exit) {
            System.out.println("\n~~~ Library Management System ~~~");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBookToLibrary(library);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    borrowBookFromLibrary(library);
                    break;
                case 4:
                    returnBookToLibrary(library);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the Library Management System... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    private static void addBookToLibrary(Library library) {
        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = sc.nextLine();
        library.addBook(title, author);
    }

    private static void borrowBookFromLibrary(Library library) {
        System.out.print("Enter the title of the book to borrow: ");
        String title = sc.nextLine();
        library.borrowbook(title);
    }

    private static void returnBookToLibrary(Library library) {
        System.out.print("Enter the title of the book to return: ");
        String title = sc.nextLine();
        library.returnBook(title);
    }
}
