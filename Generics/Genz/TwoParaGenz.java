package Genz;

public class TwoParaGenz <T, V> {
    public T val1;
    public V val2;

    public TwoParaGenz(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public V getVal2() {
        return val2;
    }
}
