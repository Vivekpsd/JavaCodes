import java.util.*;

class HashSetExample {
    Set<Integer> nums = new HashSet<Integer>();

    HashSetExample() {
        nums.add(34);
        nums.add(24);
        nums.add(10);
        nums.add(14);

        for (int i: nums)
            System.out.println(i);
    }
}

class TreeSetExample {
    Set<Integer> nums = new TreeSet<Integer>();

    TreeSetExample() {
        nums.add(34);
        nums.add(24);
        nums.add(10);
        nums.add(14);

        // Example of Iterator Interface whom Collection interface extends
        Iterator<Integer> values = nums.iterator();

        while (values.hasNext())
            System.out.println(values.next());
    }
}

public class SetExample {
    public static void main(String[] args) {
        HashSetExample exp1 = new HashSetExample();
        System.out.println("___________");
        TreeSetExample exp2 = new TreeSetExample();
    }
}
