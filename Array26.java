

public class Array26 {
    // find minimum and maximum number in array
    public static void main(String[] args) {
        int a[] = { 23, 34, 45, 12, 5 };
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("minimum number in array: " + min);
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("maximum number in array: " + max);
    }

}
