package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao implements Dao {

    @Override
    public void add(Data user) throws SQLException {
//        Connection connection = new Connection();
//        String sql = "INSERT INTO User (id, login)" +
//                "VALUES (1, timon);";
//        try {
//            connection.connect(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        String sql = "INSERT INTO User (id, login)" +
                "VALUES (?, ?);";
        try (java.sql.Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1,((User) user).getId());
            statement.setString(2,((User) user).getLogin());

            int row = statement.executeUpdate();
            System.out.println(row);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void getAll(Data user) throws SQLException {
        String sql = "SELECT * FROM User;";
//        Connection connection = new Connection();
//        try {
//            connection.connect(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        try (java.sql.Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                ((User) user).setLogin(resultSet.getString("login"));
                ((User) user).setId(resultSet.getInt("id"));

            }
        }
    }

    @Override
    public void getById() {
        String sql = "SELECT * FROM User WHERE id = ?;";
        Connection connection = new Connection();
        try {
            connection.connect(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
