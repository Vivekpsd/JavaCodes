import java.util.HashMap;
import java.util.Map;

class MapImplementation {
    Map<String, Integer> students = new HashMap<>();

    MapImplementation() {
        students.put("Vivek", 99);
        students.put("Navin", 59);
        students.put("Ishan", 78);
        students.put("Chirag", 91);

        System.out.println(students);
        System.out.println("Incorrect marks for Chirag: " + students.get("Chirag"));
        students.put("Chirag", 100);
        System.out.println("Correct marks for Chirag: " + students.get("Chirag"));
        System.out.println(students.keySet());
    }
}

public class MapExample {
    public static void main(String[] args) {
        MapImplementation example = new MapImplementation();
    }
}
