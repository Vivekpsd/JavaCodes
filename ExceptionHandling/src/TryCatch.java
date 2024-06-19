class SimpleException {
    int i = 0;
    int j = 10;

    public void execute() {
        try {
            System.out.println(j/i);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

class ExceptionClasses {
    int[] arr = new int[5];

    public void execute() {
        try {
            System.out.println(arr[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // if know the error - can print descriptive message
            System.out.println("Cannot access out of bound index");
        }
    }
}

class MultipleCatch {
    int j = 0, i = 10;
    int[] arr = new int[5];
    String test = null;

    public void execute() {
        try {
            System.out.println(test.length());
            System.out.println(i/j);
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot access index out of bound");
        } catch (NullPointerException e) {
            System.out.println("The value trying to access doesn't exist");
        } catch (Exception e) {
            // If don't know, use Exception
            // Exception is the super class!
            System.out.println("When don't know the error class type");
        }
    }
}

public class TryCatch {
    public static void main(String[] args) {
        SimpleException example1 = new SimpleException();
        example1.execute();

        ExceptionClasses example2 = new ExceptionClasses();
        example2.execute();

        MultipleCatch example3 = new MultipleCatch();
        example3.execute();
    }
}
