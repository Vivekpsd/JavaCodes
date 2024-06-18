@FunctionalInterface
interface AddTwoNumber {
    int add(int i, int j);
}

public class LambdaExpressionReturn {
    public static void main(String[] args) {
        AddTwoNumber obj = (int i, int j) -> { return i+j; };

        int result = obj.add(10, 20);
        System.out.println(result);
    }
}
