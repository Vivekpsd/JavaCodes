public class Thread1 extends Thread{

    // way to give name to the thread, using constructor
    Thread1(String threadName) {
        super(threadName);
    }

    // currentThread give information about thread
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " Created!");
    }
}
