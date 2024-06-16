class Machine {
    public void show() {
        System.out.println("Its a Machine");
    }
}

class Laptop extends Machine{
    public void show() {
        System.out.println("Its a Laptop");
    }
}

class Phone extends Machine{
    public void show() {
        System.out.println("Its a Phone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Machine obj = new Machine();
        obj.show();                             // Its a Machine

        obj = new Laptop();
        obj.show();                             // Its a Laptop

        obj = new Phone();
        obj.show();                             // Its a Phone
    }
}
