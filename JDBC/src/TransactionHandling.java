import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class TransactionHandling {
    private static final String url = "jdbc:mysql://localhost:3306/lenden";
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
            connection.setAutoCommit(false);
            String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
            String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);

            Scanner scn = new Scanner(System.in);
            System.out.print("Enter account number: ");
            int account = scn.nextInt();
            System.out.print("Enter amount: ");
            double amount = scn.nextDouble();

            debitPreparedStatement.setDouble(1, amount);
            debitPreparedStatement.setInt(2, account);
            creditPreparedStatement.setDouble(1, amount);
            creditPreparedStatement.setInt(2, 102);
            debitPreparedStatement.executeUpdate();
            creditPreparedStatement.executeUpdate();

            if (isSufficient(connection, account, amount)) {
                connection.commit();
                System.out.println("Transaction Successful!");
            } else {
                connection.rollback();
                System.out.println("Transaction Failed!!");
            }
            debitPreparedStatement.close();
            creditPreparedStatement.close();
            scn.close();
            connection.close();

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isSufficient(Connection connection, int account_number, double amount) {
        try {
            String query = "SELECT balance FROM accounts WHERE account_number = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, account_number);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double current_balance = resultSet.getDouble("balance");
                if (amount > current_balance) {
                    return false;
                } else {
                    return true;
                }
            }
            resultSet.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}