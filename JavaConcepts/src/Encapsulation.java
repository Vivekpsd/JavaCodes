class Human {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(20);
        System.out.println(obj.getAge());
        //System.out.println(obj.age); // Will be ERROR
        // Why?
        /*
        Because age is private field and can only be accessed in the assigned class.
        TIP: always declare member fields of a class as private.

        And this can be accessed through the getter and setter (declared as public)

        This binding of data member and member function is one example of encapsulation.
         */
    }
}
