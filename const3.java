public class const3 {

    // Constructor with parameters
    const3(String product, double price, int quantity) {
        double total = price * quantity;
        System.out.println("Product: " + product);
        System.out.println("Total Price: ₹" + total);
    }

    public static void main(String[] args) {
        const3 item1 = new const3("Pen", 10.5, 3);
        const3 item2 = new const3("Notebook", 55.0, 2);
    }
}
