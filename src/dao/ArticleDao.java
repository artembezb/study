package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ArticleDao implements Dao {


    @Override
    public void add(Data article) throws SQLException {

//        Connection connection = new Connection();
//        String sql = "INSERT INTO Article (id, title, idUser)" +
//                "VALUES (?, ?, ?);";
//        try {
//            connection.connect(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        System.out.println("Article name");
        String title = in.nextLine();
        System.out.println("Article name");
        int idUser = in.nextInt();
        String sql = "INSERT INTO Article (id, title, idUser)" +
                "VALUES (?, ?, ?);";
        try (java.sql.Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1,id);
            statement.setString(2,title);
            statement.setInt(3,idUser);

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
    public void getAll(Data article) {
        String sql = "SELECT * FROM Article;";
        Connection connection = new Connection();
        try {
            connection.connect(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getById() {
        String sql = "SELECT * FROM Article WHERE id = ?;";
        Connection connection = new Connection();
        try {
            connection.connect(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
