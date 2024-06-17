abstract class Car {
    public abstract void drive();
    public abstract void fly();
}

abstract class Swift extends Car{
    public void drive() {
        System.out.println("Driving Swift");
    }
}

class SwiftDesire extends Swift {
    public void fly() {
        System.out.println("Flying Swift Desire");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Swift gaddi = new SwiftDesire();
        gaddi.drive();
        gaddi.fly();
    }
}
