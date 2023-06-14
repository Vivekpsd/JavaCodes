package ProdCon;

public class Company {
    public int n;
    boolean flag = false; // false -> producer's turn

    synchronized public void produce_item(int n) {
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        flag = true;
        notify();
    }

    synchronized public int consume_item() {
        if (!flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed : " + this.n);
        flag = false;
        notify();
        return this.n;
    }
}
