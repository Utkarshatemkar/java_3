public class method2 {
    public void checkAnd() {
        boolean a = true, b = false;
        System.out.println("a && b: " + (a && b));
    }

    public void checkOr() {
        boolean a = true, b = false;
        System.out.println("a || b: " + (a || b));
    }

    public static void main(String[] args) {
        method2 obj = new method2();
        obj.checkAnd();
        obj.checkOr();
    }
}
