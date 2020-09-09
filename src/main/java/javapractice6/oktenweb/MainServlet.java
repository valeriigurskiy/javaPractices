package javapractice6.oktenweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@WebServlet(name = "hello", urlPatterns = "/hello")
public class MainServlet extends HttpServlet {
    String dbURL = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";

    public String getConnection(){
        List<Integer> integerList = new ArrayList<Integer>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, "root", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM actor");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int actorid = resultSet.getInt(1);
                integerList.add(actorid);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return integerList.toString();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String id = request.getParameter("id");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String lastupdate = request.getParameter("lastupdate");

        boolean exist = false;

        String dbIDs = getConnection();
        if(dbIDs.contains(id)) {
            exist = true;
        }

        if(exist){
            try {
                writer.println("<p>Error. User with this id already exist in database</p>");
            } finally {
                writer.close();
            }
        }
        else{
            try {
                AllActors actors = new AllActors();
                Map<Integer, String> newActors = actors.getActors();
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeNow = formatter.format(calendar.getTime());

                createActor createActor = new createActor();
                createActor.newActor(id, firstname, lastname, timeNow);

                try {
                    writer.println("<p>Id: " + id + "</p>");
                    writer.println("<p>First name: " + firstname + "</p>");
                    writer.println("<p>Last name: " + lastname + "</p>");
                    writer.println("<h4>User successfuly added\n</h4>");
                    writer.println("<p>\nAll actors</p>");
                    for(Map.Entry<Integer, String> actor : actors.getActors().entrySet()){
                        writer.println("<p>Actor id: " + actor.getKey() + "\n" + "Actor : " + actor.getValue() + "\n" + "</p>");
                    }
                } finally {
                    writer.close();
                }
            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }
        }


    }
}
