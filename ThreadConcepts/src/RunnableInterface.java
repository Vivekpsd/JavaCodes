class ThreadOne implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Woring 🎯");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadTwo implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Playing 🏓");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Runnable obj1 = new ThreadOne();
        Runnable obj2 = new ThreadTwo();

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
    }
}
