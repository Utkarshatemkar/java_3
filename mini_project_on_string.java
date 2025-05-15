import java.util.Scanner;

public class mini_project_on_string{

    // Arrays to store usernames and passwords
    static String[] usernames = new String[5];
    static String[] passwords = new String[5];
    static int userCount = 0;

    void atr2() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Welcome to Simple Login System ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    register(sc);
                    break;
                case 2:
                    login(sc);
                    break;
                case 3:
                    System.out.println("Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    void register(Scanner sc) {
        if (userCount >= usernames.length) {
            System.out.println("User limit reached. Cannot register more users.");
            return;
        }

        System.out.print("Enter a username: ");
        String uname = sc.nextLine().trim();

        System.out.print("Enter a password: ");
        String pass = sc.nextLine().trim();

        usernames[userCount] = uname;
        passwords[userCount] = pass;
        userCount++;

        System.out.println("User registered successfully!");
    }

    void login(Scanner sc) {
        System.out.print("Enter username: ");
        String uname = sc.nextLine().trim();

        System.out.print("Enter password: ");
        String pass = sc.nextLine().trim();

        boolean success = false;
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(uname) && passwords[i].equals(pass)) {
                success = true;
                break;
            }
        }

        if (success) {
            System.out.println("Login successful! Welcome, " + uname + "!");
        } else {
            System.out.println("Login failed! Invalid credentials.");
        }
    }

    public static void main(String[] args) {
        mini_project_on_string obj = new  mini_project_on_string();
        obj.atr2();
    }
}
