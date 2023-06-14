import ProdCon.Company;
import ProdCon.Producer;
import ProdCon.Consumer;

public class MainPC {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer producer = new Producer(comp);
        Consumer consumer = new Consumer(comp);

        producer.start();
        consumer.start();
    }
}