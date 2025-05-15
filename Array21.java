

public class Array21 {

    public static void main(String[] args) {
        // To find even odd numbers and store in separate array
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int even[] = new int[a.length];
        int odd[] = new int[a.length];
        int evencount = 0;
        int oddcount = 0;

        System.out.print("Even Numbers: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evencount++;
                even[i] = a[i];
                System.out.print(even[i] + " ");
            } else {
                oddcount++;
            }
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                odd[i] = a[i];
                System.out.print(odd[i] + " ");
            }
        }

    }
}
