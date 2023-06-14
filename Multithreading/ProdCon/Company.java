package ProdCon;

public class Company {
    public int n;
    boolean flag = false; // false -> producer, true -> consumer

    synchronized public void produce_item(int n) throws Exception {
        if (flag) {
            wait();
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        flag = true;
        notify();
    }

    synchronized public int consume_item() throws Exception {
        if (!flag) {
            wait();
        }
        System.out.println("Consumed: " + this.n);
        flag = false;
        notify();
        return this.n;
    }
}