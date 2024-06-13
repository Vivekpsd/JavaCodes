
class Person {
    int age;
    String name;

    // default constructor
    Person() {
        age = 10;
        name = "Abhi";
    }

    // parameterized constructor
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Person obj = new Person(24, "Vivek");
        Person obj2 = new Person();
        System.out.println(obj.age);
        System.out.println(obj2.age);
        System.out.println("Hellow World");

    }
}
