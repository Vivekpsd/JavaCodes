class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];

        // Initializing the array with Student objects
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 19);

        // Displaying details of each student
        for (Student student : students) {
            student.display();
        }
    }
}
