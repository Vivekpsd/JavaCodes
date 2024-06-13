class A {
    A() {
        System.out.println("Inside Constructor A");
    }
}

class B extends A{
    B() {
        System.out.println("Inside Constructor B");
    }

    B(int value) {
        this();
        System.out.println("Inside Parameterized Constructor B");
    }
}

public class Super {
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
