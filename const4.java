

class con4class {
    void show() {
        System.out.println("show");
    }

    void get() {
        show();// no need this keyword compilor automaticallyunderstand
        System.out.println("get");
    }

    void get1() {
        get();// this method
        System.out.println("get1");
    }
}

public class const4 {

    public static void main(String[] args) {
        con4class c4 = new con4class();
        c4.get1();
    }

}
