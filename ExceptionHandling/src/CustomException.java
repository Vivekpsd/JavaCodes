// Define a custom exception by extending Exception class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

class Employee {
    String name = "Vivek";

    // Method to check character access
    public void checkCharAt(int index) throws MyCustomException {
        try {
            char ch = name.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            // Throw custom exception with appropriate message
            throw new MyCustomException("Index " + index + " is out of bounds");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Try to access a character at an invalid index
        try {
            employee.checkCharAt(100);
        } catch (MyCustomException e) {
            // Catch and handle the custom exception
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }
}
