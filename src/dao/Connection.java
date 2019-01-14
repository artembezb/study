package dao;

import org.sqlite.JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
    public static void connect(String sql) throws SQLException {
        DriverManager.registerDriver(new JDBC());

        try (java.sql.Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8.db")){
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
            System.out.println(row);
        }
    }
}
