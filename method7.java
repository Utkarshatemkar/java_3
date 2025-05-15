public class method7 {

    // Method to calculate and display the total bill from item prices
    public void calculateBill(double[] prices) {
        double total = 0;
        System.out.println("Item Prices:");
        for (double price : prices) {
            System.out.println("₹" + price);
            total += price;
        }
        System.out.println("Total Bill: ₹" + total);
    }

    public static void main(String[] args) {
        method7 restaurant = new method7();
        
        // Example item prices in a restaurant order
        double[] itemPrices = {120.0, 250.0, 80.5, 99.9, 60.0};

        // Calculate total bill
        restaurant.calculateBill(itemPrices);
    }
}
