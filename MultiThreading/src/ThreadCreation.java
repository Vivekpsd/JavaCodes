public class ThreadCreation {
    public static void main(String[] args) {
        System.out.println("Main is started");

        // both print statement of main will execute prior to executing these threads
        // thread works asynchronously
        Thread1 task = new Thread1("Task");
        task.start();

        Thread1 leisure = new Thread1("Leisure");
        leisure.setDaemon(true);
        leisure.start();

        // [Runnable Method#2] Thread constructor takes object of the runnable interface
        Thread activity = new Thread(new Thread2(), "Activity");
        activity.start();

        System.out.println("Main is exiting");
    }
}
