class Laptop {
    String model;
    int UID;

    Laptop(String model, int UID) {
        this.model = model;
        this.UID = UID;
    }

    public String toString() {
        return "ID: " + UID + ", Model: " + model;
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Laptop device = new Laptop("Lenovo", 1232);
        System.out.println(device);
    }
}
