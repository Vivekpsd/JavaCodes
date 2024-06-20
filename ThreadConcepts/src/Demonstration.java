class Work extends Thread{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Woring 🎯");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Play extends Thread{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Playing 🏓");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Demonstration {
    public static void main(String[] args) {
        Work thread1 = new Work();
        Play thread2 = new Play();

        // This will make them run in parallel :)
        thread1.start();
        thread2.start();
    }
}
