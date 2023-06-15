import java.util.Scanner;

class EligibilityException extends Exception {
    public EligibilityException(String message) {
        System.out.println(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int age;
        System.out.println("Enter age: ");
        age = scn.nextInt();

        try {
            if (age < 18)
                throw new EligibilityException("Not eligible for voting...");
        } catch(EligibilityException e) {
            System.out.println("Something went wrong");
        }

        scn.close();

    }
}
