class LoosingData {
    int num = 100;
    int divBy = 200;

    public void loosingDate() {
        try {
            int ans = num/divBy;
            if (ans == 0) {
                // creating object of ArithmeticException class and throwing it
                // also printing custom message using constructor
                throw new ArithmeticException("store value in double");
            }
        } catch (ArithmeticException e) {
            System.out.println("This catch was thrown manually: \n" + e);
        }
    }
}

public class ThrowKeyword {
    public static void main(String[] args) {
        LoosingData obj = new LoosingData();
        obj.loosingDate();
    }
}
