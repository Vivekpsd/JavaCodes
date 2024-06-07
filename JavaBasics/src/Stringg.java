public class Stringg {
    public static void main(String[] args) {

        // String is a class, should be used like this -
        String name = new String("vivek");

        // then why this also works? BTS it does same thing. ..
        String game = "velorant";

        // basic methods
        System.out.println(name.length());
        System.out.println(name.indexOf('e'));
        System.out.println(game.charAt(5));

        // StringBuffer - mutable string
        StringBuffer sb = new StringBuffer("Vivek");
        System.out.println(sb.capacity()); // default size 16 char - now 21

        sb.append(" Prasad");
        sb.insert(0, "Mr. ");
        System.out.println(sb);
    }
}
