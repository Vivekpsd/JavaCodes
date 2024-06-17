class Fruit {
    String name;

    public void quality() {
        System.out.println("Fruits are fresh and tasty!");
    }

    // Apple here is an inner class

    class Apple {
        public void price() {
            System.out.println("Apple rate is $100 per KG!");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.quality();

        // But how to call inner class Apple?
        // To call inner class Apple, we need help of object fruit

        Fruit.Apple apple = fruit.new Apple();
        apple.price();
    }
}
