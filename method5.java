public class method5 {
    public void show(int a) {
        System.out.println("Integer: " + a);
    }

    public void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        method5 obj = new method5();
        obj.show(10);
        obj.show("Hello");
    }
}
