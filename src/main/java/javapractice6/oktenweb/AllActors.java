package javapractice6.oktenweb;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class AllActors {
    public Map<Integer, String> getActors() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
        ResultSet resultSet = preparedStatement.executeQuery();

        Map<Integer, String> integerList = new HashMap<>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String firstname = resultSet.getString(2);
            String lastname = resultSet.getString(3);
            String lastupdate = resultSet.getString(4);
            integerList.put(id, firstname + " " + lastname + " " + lastupdate);
        }
        return integerList;
    }
}
