public class Driver {
    public static void main(String[] args) {
        // member 1
        TVSet tvset1ForMember1 = TVSet.getTVSetInstance();
        // member 2
        TVSet tvset1ForMember2 = TVSet.getTVSetInstance();

        // only a single instance will be returned to both these reference variables.

        System.out.println(tvset1ForMember1);
        System.out.println(tvset1ForMember2);
    }
}
