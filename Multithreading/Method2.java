class Task2 implements Runnable{
    public void run() {
        System.out.println("Running");
    }
}

public class Method2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        Thread doer = new Thread(task);
        doer.start();
    }
}
