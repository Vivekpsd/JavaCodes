public class TVSet {
    private static volatile TVSet tvsetInstance = null;
    private TVSet() {
        System.out.println("TV Set instantiated");
    }

    public static TVSet getTVSetInstance() {
        if(tvsetInstance == null) {
            synchronized (TVSet.class) {
                // double-checking
                if(tvsetInstance == null) {
                    tvsetInstance = new TVSet();
                }
            }
        }
        return tvsetInstance;
    }
}