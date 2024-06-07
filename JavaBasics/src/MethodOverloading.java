class SciFiCalc {
    int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

    int add(int n1, int n2) {
        return n1 + n2;
    }

    double add(int n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        SciFiCalc calc = new SciFiCalc();
        System.out.println(calc.add(10, 10, 10));
        System.out.println(calc.add(10, 10));
        System.out.println(calc.add(10, 10.0));
    }
}
