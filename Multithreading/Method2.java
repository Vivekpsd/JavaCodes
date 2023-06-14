
class Task2 implements Runnable{
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Loading...");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Method2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        Thread doer = new Thread(task);

        Task doer2 = new Task();

        doer.start();
        doer2.start();
    }
}
