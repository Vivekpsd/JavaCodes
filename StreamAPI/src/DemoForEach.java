import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ForEachWorking {
    ForEachWorking() {
        List<Integer> nums = Arrays.asList(4, 5, 2, 3, 1);

        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        nums.forEach(con);

        // above is the abstraction behind the forEach loop
        // nums.forEach(n -> System.out.println(n));
    }
}

public class DemoForEach {
    public static void main(String[] args) {
        ForEachWorking demo = new ForEachWorking();
    }
}
