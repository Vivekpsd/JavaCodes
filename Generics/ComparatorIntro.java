import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ComparatorIntro {
    public static void main(String[] args) {
        // comparotor for sorting with unit digit of array elements...
        // comparator is an interface and this is implimentation of anonymous interface
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1; // swap
                else
                    return -1; // not swap
            }
        };

        
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}