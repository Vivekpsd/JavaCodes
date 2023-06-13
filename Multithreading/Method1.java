class Task extends Thread {
    public void run() {
        System.out.println("Running");
    }
}

public class Method1 {
    public static void main(String[] args) {
        Task t1 = new Task();
        t1.start();
    }
}