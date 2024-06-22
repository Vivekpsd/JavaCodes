import java.sql.Array;
import java.util.*;

// Sorting array elements normally
class NormalSort {
    NormalSort() {
        List<Integer> array = new ArrayList<>();
        array.add(50);
        array.add(40);
        array.add(30);
        array.add(20);
        array.add(10);

        Collections.sort(array);
        System.out.println(array);
    }
}

// What if you want to sort based on the last digit
class ComparatorMethod {
    ComparatorMethod() {
        List<Integer> array = new ArrayList<>();
        array.add(50);
        array.add(40);
        array.add(30);
        array.add(20);
        array.add(10);

        System.out.println("Before Sorting: " + array);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(array, com);
        System.out.println("After Sorting: " + array);
    }
}

// Student class implementing Comparable interface
class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        // Sorting based on age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}

class ComparableMethod {
    ComparableMethod() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 25));
        students.add(new Student("David", 22));

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the list of students by age
        Collections.sort(students);

        // Print the list after sorting
        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class LearnComparator {
    public static void main(String[] args) {
        NormalSort obj = new NormalSort();
        System.out.println("-------------");
        ComparatorMethod obj2 = new ComparatorMethod();
        System.out.println("-------------");
        ComparableMethod obj3 = new ComparableMethod();
    }
}
