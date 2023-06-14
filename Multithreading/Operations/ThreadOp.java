//package Operations;

public class ThreadOp {
    public static void main(String[] args) throws Exception {
        System.out.println("Program Started!");

        int x = 50; int y = 50;
        System.out.println("Sum: "+ (x+y));

        // Main also is a thread...
        Thread t = Thread.currentThread();
        System.out.println("Current Running Thread: " + t.getName());

        Thread.sleep(5000);

        System.out.println("Program Terminated!");
    }
}
