public class Array3 {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int ele = 3;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("not found");
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != ele) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
