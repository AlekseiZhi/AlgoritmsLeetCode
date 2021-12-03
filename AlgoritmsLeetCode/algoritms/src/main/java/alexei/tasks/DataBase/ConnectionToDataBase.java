package alexei.tasks.DataBase;

import java.sql.*;

public class ConnectionToDataBase {

    private static final String dBDriver = "jdbc:postgresql://127.0.0.1:5432/JavaLearn";
    private static final String dBUser = "postgres";
    private static final String dBDPassword = "123";

    public void outputConsole() throws SQLException {
        try (Connection dbConnection = getDBConnection()) {
            Statement statement = dbConnection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Id FROM Users WHERE name = 'Vasay' ");
            while (resultSet.next()) {
                String str = resultSet.getString(1);
                System.out.println(str);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void switchData() throws SQLException {
        try (Connection dbConnection = getDBConnection()) {
            Statement statement = dbConnection.createStatement();
            ResultSet resultSet = statement.executeQuery("INSERT INTO users VALUES (6,'Hundai',140);");
            while (resultSet.next()) {
                String str = resultSet.getString(1);
                System.out.println(str);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getDBConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver is found");
        } catch (ClassNotFoundException e) {
            System.out.println("where is driver?");
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(dBDriver, dBUser, dBDPassword);
            System.out.println("successful connect to database");
        } catch (SQLException exception) {
            System.out.println("fail connection to database ");
            exception.printStackTrace();
        }
        return connection;
    }
}