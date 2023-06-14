
class Task extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}

public class Method1 {
    public static void main(String[] args) {
    }
}