import Genz.*;

public class TwoParaGenericClass {
    public static void main(String[] args) {
        TwoParaGenz<Integer, Integer> obj = new TwoParaGenz<>(10, 20);
        System.out.println(obj.getVal2());
    }
}
