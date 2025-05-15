/*
 * A method in Java is a block of code that performs a specific task.
 * It is used to improve code reusability, readability, and modularity.
 * Syntax of a Method:
 * returnType methodName(parameters) {
 * // method body
 * }
 */
public class method1 {
    public void addition() {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
    }

    public void subtraction() {
        int a = 10, b = 5;
        System.out.println("Subtraction: " + (a - b));
    }

    public static void main(String[] args) {
        method1 obj = new method1();
        obj.addition();
        obj.subtraction();
    }
}
