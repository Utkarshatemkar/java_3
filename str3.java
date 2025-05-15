import java.util.Scanner;

public class str3 {

    void atr2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Compare
        if (s1.equals(s2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // Concatenation
        String result = s1.concat(" ").concat(s2);
        System.out.println("Concatenated string: " + result);
        sc.close();
    }

    public static void main(String[] args) {
        str3 obj = new str3();
        obj.atr2();
    }
}
