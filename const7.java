public class const7 {
    double principal, rate;
    int time;

    // Constructor
    const7(double p, double r, int t) {
        principal = p;
        rate = r;
        time = t;
    }

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: ₹" + interest);
    }

    public static void main(String[] args) {
        const7 loan = new const7(10000, 5.5, 3);
        loan.calculateInterest();
    }
}
