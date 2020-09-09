package javapractice6.oktenweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class createActor {
    String dbURL = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
    public void newActor(String id, String firstname, String lastname, String lastupdate) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbURL, "root", "root");
        String sql = "insert into actor(actor_id, first_name, last_name, last_update) VALUES (?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, Integer.parseInt(id));
        statement.setString(2, firstname);
        statement.setString(3, lastname);
        statement.setString(4, lastupdate);

        statement.executeUpdate();
    }
}

