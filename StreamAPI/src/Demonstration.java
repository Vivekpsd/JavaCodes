// Problem Statement: Find all the even numbers, double them and then sum them up.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class NormalMethod {
    int sum = 0;
    List<Integer> nums = Arrays.asList(4, 5, 2, 3, 6);
    NormalMethod() {
        for(int i: nums) {
            if (i%2 == 0) {
                int num = i*2;
                sum += num;
            }
        }

        System.out.println("#1_Answer: " + sum);
    }
}

class DemoStreamAPI {
    List<Integer> nums = Arrays.asList(4, 5, 2, 3, 6);

    DemoStreamAPI() {
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c, e) -> c+e);

        System.out.println("#2_Answer: " + result);
    }
}

class BetterStreamAPI {
    List<Integer> nums = Arrays.asList(4, 5, 2, 3, 6);

    BetterStreamAPI() {
        int result = nums.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);

        System.out.println("#3_Answer: " + result);
    }
}

public class Demonstration {
    public static void main(String[] args) {
        NormalMethod demo1 = new NormalMethod();

        // using stream API
        DemoStreamAPI demo2 = new DemoStreamAPI();

        // using stream API optimized
        BetterStreamAPI demo3 = new BetterStreamAPI();
    }
}
