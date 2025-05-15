import java.util.Scanner;

public class str5 {

    void atr2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String s = sc.nextLine();

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
        sc.close();
    }

    public static void main(String[] args) {
        str5 obj = new str5();
        obj.atr2();
    }
}
