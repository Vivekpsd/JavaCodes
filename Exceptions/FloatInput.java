import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int chances = 3;
        double value = 0.0;
        double sum = 0;
        while (chances > 0) {
            try {
                System.out.println("Enter floating point no: ");
                value = scn.nextDouble();
                sum += value;
            } catch (InputMismatchException e) {
                chances--;
                if (chances == 0) {
                    break;
                }
                System.out.println("Invalid input. You have " + chances + " more chance(s).");
                scn.nextLine();
            }
        }
        System.out.println("Sum of valid values: " + sum);

        scn.close();
    }
}
