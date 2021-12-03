package alexei.tasks.DataBase;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        ConnectionToDataBase connectionToDataBase = new ConnectionToDataBase();
        connectionToDataBase.outputConsole();
    }
}