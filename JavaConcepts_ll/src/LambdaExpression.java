@FunctionalInterface
interface Example {
    void show();
}

public class LambdaExpression {
    public static void main(String[] args) {
        Example Normal_Way = new Example() {
            public void show() {
                System.out.println("In normal Functional Interface");
            }
        };
        Normal_Way.show();

        // this is how lambda expression is implemented
        Example LambdaWay = () -> System.out.println("In Lambda Expression");
        LambdaWay.show();
    }
}
