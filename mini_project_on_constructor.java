import java.util.Scanner;

public class mini_project_on_constructor {

    // Attributes
    String bookName;
    String author;
    int bookId;
    boolean isIssued;

    // Constructor
    mini_project_on_constructor(int id, String name, String writer) {
        bookId = id;
        bookName = name;
        author = writer;
        isIssued = false;
    }

    // Method to issue a book
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(" Book '" + bookName + "' issued successfully.");
        } else {
            System.out.println(" Book '" + bookName + "' is already issued.");
        }
    }

    // Method to return a book
    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(" Book '" + bookName + "' returned successfully.");
        } else {
            System.out.println(" Book '" + bookName + "' was not issued.");
        }
    }

    // Method to display book details
    void display() {
        System.out.println(
                "Book ID: " + bookId + ", Title: " + bookName + ", Author: " + author + ", Issued: " + isIssued);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating books using constructor
        mini_project_on_constructor b1 = new mini_project_on_constructor(101, "Java Programming", "James Gosling");
        mini_project_on_constructor b2 = new mini_project_on_constructor(102, "C++ Basics", "Bjarne Stroustrup");
        mini_project_on_constructor b3 = new mini_project_on_constructor(103, "Python for All", "Guido van Rossum");

        int choice;
        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. Display Book Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b1.issueBook();
                    break;
                case 2:
                    b1.returnBook();
                    break;
                case 3:
                    b1.display();
                    b2.display();
                    b3.display();
                    break;
                case 4:
                    System.out.println("Thank you for using Library System!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
