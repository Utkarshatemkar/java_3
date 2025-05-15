public class const5 {

    // Constructor with parameters
    const5(String movieName, String showTime) {
        System.out.println("Movie Booked: " + movieName);
        System.out.println("Show Time: " + showTime);
    }

    public static void main(String[] args) {
        const5 booking1 = new const5("Avengers", "7:30 PM");
        const5 booking2 = new const5("Pathaan", "9:00 PM");
    }
}
