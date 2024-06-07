import java.util.Scanner;

class Calculator {
    // fields
    int num1;
    int num2;

    // constructor
    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // methods
    int add() {
        return num1 + num2;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        Calculator calc = new Calculator(num1, num2);
        int result = calc.add();
        System.out.println("Result: " + result);
    }
}
