package dao;


import java.sql.SQLException;

interface Dao{
   public void add(Data object) throws SQLException; //на вход или статья или пользователь
    public void delete(); //на вход или статья или пользователь
    public void update(); //на вход или статья или пользователь
    public void getAll(Data object) throws SQLException; //на вход или статья или пользователь
    public void getById(); //на вход или статья или пользователь
}


