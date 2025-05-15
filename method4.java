public class method4 {
    public int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public void showResult() {
        System.out.println("Factorial of 5: " + factorial(5));
    }

    public static void main(String[] args) {
        method4 obj = new method4();
        obj.showResult();
    }
}
