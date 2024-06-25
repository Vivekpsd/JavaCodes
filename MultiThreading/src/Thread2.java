public class Thread2  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " Created!");
    }
}
