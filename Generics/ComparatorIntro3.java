import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }
}

public class ComparatorIntro3 {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Vivek"));
        studs.add(new Student(23, "Pawan"));
        studs.add(new Student(18, "Mohit"));
        studs.add(new Student(25, "Meghna"));

        // will sort based on age
        Collections.sort(studs, com);
        for (Student s:studs)
            System.out.println(s);
    }
}
