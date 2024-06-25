public class TVSet {
    private static TVSet tvsetInstance = null;
    private TVSet() {
        System.out.println("TV Set instantiated");
    }

    public static TVSet getTVSetInstance() {
        if(tvsetInstance == null)
            tvsetInstance =  new TVSet();
        return tvsetInstance;
    }
}

