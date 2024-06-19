public class ErrorTypes {
    public static void main(String[] args) {
        // Compile-time error: missing semicolon and undeclared variable
//         System.out.println("This will cause a compile-time error")

        // Corrected version to avoid compile-time error
        // System.out.println("This is correct");

        // Run-time error: division by zero
        int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b; // This will cause a run-time error: ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught a runtime error: " + e.getMessage());
        }

        // Logical error: incorrect logic
        int number = 5;
        int factorial = 1;
        for (int i = 1; i <= number; i--) { // This will cause an infinite loop (logical error)
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial); // Incorrect result due to logical error
    }
}
