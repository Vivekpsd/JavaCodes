import java.util.GregorianCalendar;

class StaticVar {
    // Static variable declaration
    static int staticVariable;
    int marks;

    // Static block for initialization
    static {
        staticVariable = 10;
    }

    StaticVar() {
        staticVariable++;
    }
}


class StaticMethod {
    static int staticVariable = 10;
    String Greetings = "Good Morning, ";

    // Error: cannot directly reference non-static variable in static method
//    public static void display() {
//        System.out.println(Greetings + "Static variable value: " + staticVariable);
//    }

    // If you have object reference, we can do so indirectly
    public static void display(StaticMethod obj) {
        System.out.println(obj.Greetings + "Static variable value: " + staticVariable);
    }
}

public class StaticVarMethod {
    public static void main(String[] args) {

        // ====================== Static Variable =================

        StaticVar obj1 = new StaticVar(); // +1
        StaticVar obj2 = new StaticVar(); // +1
        StaticVar obj3 = new StaticVar(); // +1

        System.out.println("Value of static variable: " + StaticVar.staticVariable);
        // 10 + 3 = 13


        // ====================== Static Method =================
        StaticMethod obj = new StaticMethod();
        System.out.println(obj.Greetings);
        StaticMethod.display(obj);

    }
}
