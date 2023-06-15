import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student that) {
        return Integer.compare(this.age, that.age);
    }

    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }
}

public class ComparableIntro {
    public static void main(String[] args) {

        // Comparator<Student> com = new Comparator<Student>() {
        //     public int compare(Student s1, Student s2) {
        //         return Integer.compare(s1.age, s2.age);
        //     }
        // };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Vivek"));
        studs.add(new Student(23, "Pawan"));
        studs.add(new Student(18, "Mohit"));
        studs.add(new Student(25, "Meghna"));

        // will sort based on age
        // instead of using com, just using comparable method through which Student can compare withing themselves to sort based on the age.
        Collections.sort(studs);

        for (Student s:studs)
            System.out.println(s);
    }
}
