import java.util.Scanner;

public class str4 {

    void atr2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        sc.close();
    }

    public static void main(String[] args) {
        str4 obj = new str4();
        obj.atr2();
    }
}
