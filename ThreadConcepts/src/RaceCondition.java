class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

// This counter class will lead to race condition - without synchronized
//class Counter {
//    int count;
//
//    public void increment() {
//        count++;
//    }
//}

public class RaceCondition {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count (should be 2000): " + counter.count);
    }
}
