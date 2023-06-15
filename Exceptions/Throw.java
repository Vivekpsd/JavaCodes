public class Throw {
    public static void main(String[] args) {
        int i = 0;
        int j = 18;
        int num = 0;

        try {
            num = j / i;
            if (num == 0) throw new ArithmeticException("Some Message");
        } catch (ArithmeticException e) {
            num = j / 1;
            System.out.println("Default Output " + e);
        }

        System.out.println("J value: " + j);
    }
}
