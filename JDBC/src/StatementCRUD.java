import java.sql.*;
import java.util.Scanner;

public class StatementCRUD {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "password";

    public static void main(String[] args) {
        int option = 0;
        Scanner scn = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            while(true) {
                System.out.println("___________________");
                System.out.println("1. Retrieve Record");
                System.out.println("2. Delete Record");
                System.out.println("3. Update Record");
                System.out.println("4. Create Record");
                System.out.println("5. Exit");
                System.out.print("Enter your option: ");
                option = scn.nextInt();

                if (option == 5) break;

                switch (option) {
                    case 1:
                        String retrieveQuery = "SELECT * from students";
                        ResultSet resultSet = statement.executeQuery(retrieveQuery);
                        while(resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String name = resultSet.getString("name");
                            int age = resultSet.getInt("age");
                            double marks = resultSet.getDouble("marks");
                            System.out.println("ID: " + id);
                            System.out.println("Name: " + name);
                            System.out.println("age: " + age);
                            System.out.println("marks: " + marks);
                        }
                        break;
                    case 2:
                        System.out.print("Enter record id to delete: ");
                        int id = scn.nextInt();
                        String deleteQuery = String.format("DELETE from students WHERE ID = %d", id);
                        int rowsAffected = statement.executeUpdate(deleteQuery);

                        if (rowsAffected > 0) System.out.println("Deleted Successfully!");
                        else System.out.println("Not Deleted");
                        break;
                    case 3:
                        System.out.print("Enter record id to update: ");
                        id = scn.nextInt();
                        System.out.print("Enter marks to update with: ");
                        Double marks = scn.nextDouble();
                        String updateQuery = String.format("UPDATE students SET marks = %f WHERE id = %d", marks, id);
                        rowsAffected = statement.executeUpdate(updateQuery);

                        if (rowsAffected > 0) System.out.println("Updated Successfully!");
                        else System.out.println("Not Updated!");
                        break;
                    case 4:
                        String createQuery = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %o, %f)", "Ankit", 22, 74.5);
                        rowsAffected = statement.executeUpdate(createQuery);

                        if (rowsAffected > 0) System.out.println("Data inserted successfully");
                        else System.out.println("Data not inserted!");
                        break;
                    case 5: break;
                }

            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}