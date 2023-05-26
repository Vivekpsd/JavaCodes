import Genz.Printer;

public class GenericPrinter {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(10);
        printer.print();
    }
} 