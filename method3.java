public class method3 {
    public void isGreater() {
        int a = 15, b = 10;
        System.out.println("a > b: " + (a > b));
    }

    public void isEqual() {
        int a = 10, b = 10;
        System.out.println("a == b: " + (a == b));
    }

    public static void main(String[] args) {
        method3 obj = new method3();
        obj.isGreater();
        obj.isEqual();
    }
}
