import java.sql.*;
import java.util.Scanner;

public class BatchStatement {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "password";

    public static void main(String[] args) {
        try {
            Class.forName("com.myql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scn = new Scanner(System.in);
            Statement statement = connection.createStatement();
            while (true) {
                System.out.print("Enter name: ");
                String name = scn.next();
                System.out.print("Enter age: ");
                int age = scn.nextInt();
                System.out.print("Enter marks: ");
                double marks = scn.nextDouble();
                System.out.print("Enter more date(Y/N): ");
                String choice = scn.next();
                String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %f)", name, age, marks);

                statement.addBatch(query);
                if (choice.toUpperCase().equals("N")) {
                    break;
                }
            }
            int[] arr = statement.executeBatch();
            // returns result as array of 0s and 1s where 0 represents errors

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println("Query: " + i + "not executed Successfully!");
                }
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}