import java.util.Scanner;

public class str2 {

    void atr2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("Length of the word: " + word.length());
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));
        sc.close();
    }

    public static void main(String[] args) {
        str2 obj = new str2();
        obj.atr2();
    }
}
