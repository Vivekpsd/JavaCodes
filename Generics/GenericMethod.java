public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        Double[] doubleArr = {1.2, 2.5, 3.5, 4.4, 4.3};
        Character[] chArr = {'a', 'b', 'd', 'e'};
        String[] strArr = {"abc", "hello", "world"};

        // single method for printing all different arrays (using generic methods)
        displayArray(intArr);
        displayArray(doubleArr);
        displayArray(chArr);
        displayArray(strArr);

        // generic method with return type
        System.out.println("\nFirst element of all arrays: ");

        System.out.println(getFirstEle(intArr));
        System.out.println(getFirstEle(doubleArr));
        System.out.println(getFirstEle(chArr));
        System.out.println(getFirstEle(strArr));

    }

    public static <Thing> void displayArray(Thing[] arr) {
        for (Thing n : arr) {
            System.out.println(n + " ");
        }
        System.out.println("");
    }

    public static <Thing> Thing getFirstEle(Thing[] arr) {
        return arr[0];
    }
}
