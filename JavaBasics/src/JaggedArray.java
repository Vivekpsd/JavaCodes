public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int row[]: arr) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        /* output
        5 7 3
        6 0 4 3
        1 6
         */
    }
}
