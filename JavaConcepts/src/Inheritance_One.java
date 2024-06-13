class Calc {
    public int add(int num1, int num2) {
        return num1+num2;
    }

    public int sub(int num1, int num2) {
        return num2 - num1;
    }
}

class AdvCalc extends Calc {
    public int multi(int num1, int num2) {
        return num1*num2;
    }

    public int division(int num1, int num2) {
        return num1/num2;
    }
}

class SciFiCalculator extends AdvCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Inheritance_One {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        AdvCalc adv_calc = new AdvCalc();

        System.out.println(adv_calc.add(10, 20));
        System.out.println(adv_calc.sub(10, 20));

        // advance calculator extending the feature of calculator
        // advance calculator can perform multi, division along with addition subtraction

        System.out.println(adv_calc.multi(10, 2));
        System.out.println(adv_calc.division(10, 2));

        // multilevel inheritance -
        SciFiCalculator sci_calc = new SciFiCalculator();
        System.out.println(sci_calc.power(10, 2));

        System.out.println();
  }
}
