import java.sql.*;
import java.util.Scanner;

public class PreparedStatementCRUD {
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
                        System.out.print("Enter record id to retrieve marks of: ");
                        int id = scn.nextInt();
                        String retrieveQuery = "SELECT * from students WHERE id = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(retrieveQuery);
                        preparedStatement.setInt(1, id);

                        ResultSet resultSet = preparedStatement.executeQuery();
                        if(resultSet.next()) {
                            System.out.println("Marks: " + resultSet.getDouble("marks"));
                        } else {
                            System.out.println("Marks not found");
                        }
                        break;
                    case 2:
                        System.out.print("Enter record id to delete: ");
                        id = scn.nextInt();
                        String deleteQuery = "DELETE FROM students WHERE id = ?";
                        preparedStatement = connection.prepareStatement(deleteQuery);
                        preparedStatement.setInt(1, id);

                        int rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) System.out.println("Deleted Successfully");
                        else System.out.println("Data Not Deleted");
                        break;
                    case 3:
                        System.out.print("Enter record id to update: ");
                        id = scn.nextInt();
                        System.out.print("Enter updated marks: ");
                        double marks = scn.nextDouble();
                        String updateQuery = "UPDATE students SET marks = ? WHERE id = ?";
                        preparedStatement = connection.prepareStatement(updateQuery);
                        preparedStatement.setDouble(1, marks);
                        preparedStatement.setInt(2, id);

                        rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) System.out.println("Updated Successfully");
                        else System.out.println("Data Not Updated");
                        break;
                    case 4:
                        String insertQuery = "INSERT INTO students(name, age, marks) VALUES(?,?,?)";
                        preparedStatement = connection.prepareStatement(insertQuery);
                        preparedStatement.setString(1, "Jonas");
                        preparedStatement.setInt(2, 28);
                        preparedStatement.setDouble(3, 85.0);

                        rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) System.out.println("Inserted Successfully");
                        else System.out.println("Not Inserted");
                        break;
                    case 5: break;
                }

            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
