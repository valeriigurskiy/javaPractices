package javapractice5;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(dbURL, "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
        ResultSet resultSet = preparedStatement.executeQuery();

        Actor testActor = new Actor(206, "Стас", "Иванов", "2006-02-15 04:34:33");

        create(testActor);
//        update(201);
        read(resultSet);
//        delete(201);
    }

    public static void create(Actor actor) throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(dbURL, "root", "root");


        String sql = "insert into actor(actor_id, first_name, last_name, last_update) VALUES (?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, actor.getActor_id());
        statement.setString(2, actor.getFirstName());
        statement.setString(3, actor.getLastName());
        statement.setString(4, actor.getLast_update());

        statement.executeUpdate();
    }

    public static void read(ResultSet resultSet) throws SQLException {
        ArrayList<Actor> actors = new ArrayList<Actor>();

        while(resultSet.next()){
            int actor_id = resultSet.getInt(1);
            String firstName = resultSet.getString(2);
            String lastName = resultSet.getString(3);
            String lastUpdate = resultSet.getString(4);

            actors.add(new Actor(actor_id, firstName,lastName,lastUpdate));
        }

        Iterator<Actor> iterator = actors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void update(int actorId) throws SQLException{
        String dbURL = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(dbURL, "root", "root");

        String sql = "update actor set first_name=?, last_name=?, last_update=? where actor_id=?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "Stepan");
        statement.setString(2, "Stepanov");
        statement.setString(3, "2006-02-15 04:34:33");
        statement.setInt(4, actorId);

        statement.executeUpdate();
    }

    public static void delete(int actorId) throws SQLException{
        String dbURL = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(dbURL, "root", "root");

        String sql = "delete from actor where actor_id=?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,actorId);

        statement.executeUpdate();

    }
}
