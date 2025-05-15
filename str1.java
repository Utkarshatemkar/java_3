import java.util.Scanner;
/*

1. String is a sequence of characters, part of the `java.lang` package.
2. It is immutable, meaning its value cannot be changed after creation.
3. Strings can be created using string literals (`"Hello"`) or the `new` keyword (`new String("Hello")`).
4. Java provides several methods like `length()`, `charAt()`, `concat()`, `toUpperCase()` for string manipulation.
5. String comparison can be done using methods like `equals()` and `equalsIgnoreCase()`.
6. Strings are widely used for handling text data efficiently in Java.
 */
public class str1 {

    void atr2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "! Welcome to Java Strings.");
        sc.close();
    }

    public static void main(String[] args) {
        str1 obj = new str1();
        obj.atr2();
    }
}
