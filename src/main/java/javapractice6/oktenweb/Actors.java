package javapractice6.oktenweb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Actors {

    public String getActorsId() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<Integer> integerList = new ArrayList<Integer>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            integerList.add(id);
        }
        return integerList.toString();
    }
}
