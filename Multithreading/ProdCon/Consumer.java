package ProdCon;

public class Consumer extends Thread{
    Company c;

    public Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while(true) {
            try {
                this.c.consume_item();
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}