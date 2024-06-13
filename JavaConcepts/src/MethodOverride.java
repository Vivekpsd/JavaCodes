class License {
    public void uniqueID() {
        System.out.println("License unique id");
    }

    public void PUCC() {
        System.out.println("PUCC Validated");
    }
}

class Aadhar extends License{
    public void uniqueID() {
        System.out.println("Aadhar Unique id");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Aadhar aadhar = new Aadhar();
        aadhar.uniqueID();
        aadhar.PUCC();
    }
}
