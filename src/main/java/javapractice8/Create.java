package javapractice8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {
    private String dbURL = "jdbc:mysql://localhost:3306/jsonplaceholder?serverTimezone=UTC";
    public void newUser(int id, String name, String username, String email, String phone, String website) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbURL, "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user(id, name, username, email, phone, website) values (?,?,?,?,?,?)");

        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, username);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, phone);
        preparedStatement.setString(6, website);

        preparedStatement.executeUpdate();
    }

    public void newPost(int userId, int id, String title, String body) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbURL, "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into posts(userId, id, title, body) values (?,?,?,?)");

        preparedStatement.setInt(1,userId);
        preparedStatement.setInt(2,id);
        preparedStatement.setString(3,title);
        preparedStatement.setString(4,body);

        preparedStatement.executeUpdate();
    }

    public void newComment(int postId, int id, String name, String email, String body) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbURL, "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into comments(postId, id, name, email, body) values (?,?,?,?,?)");

        preparedStatement.setInt(1, postId);
        preparedStatement.setInt(2, id);
        preparedStatement.setString(3, name);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, body);

        preparedStatement.executeUpdate();
    }
}

