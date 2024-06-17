interface Animal {
    void eat();
}
interface Pet {
    void play();
}

// Implementing multiple inheritance using interface
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

public class LearnInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}