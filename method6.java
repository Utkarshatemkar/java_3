public class method6 {

    // Method to swap two numbers using a temporary variable
    public void swap(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        method6 obj = new method6();
        int num1 = 10;
        int num2 = 20;
        obj.swap(num1, num2);
    }
}
