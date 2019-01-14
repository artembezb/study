package dao;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS User (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "login TEXT NOT NULL);";

        Connection conn = new Connection();
        try {
            conn.connect(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        String sql1 = "CREATE TABLE IF NOT EXISTS Article (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "title TEXT NOT NULL," +
                "idUser INTEGER NOT NULL);";

        Connection conn1 = new Connection();
        try {
            conn1.connect(sql1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Data user = new User();

        ((User) user).setId(3);
        ((User) user).setLogin("frank");

        UserDao userDao = new UserDao();

        userDao.add(user);

        Data article = new Article();

        ArticleDao articleDao = new ArticleDao();

        articleDao.add(article);



    }


}
