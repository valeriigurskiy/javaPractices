package javapractice8;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;

public class Get {
    public void getUsersFromJPH() {
        int i = 0;
        Create create = new Create();
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            StringBuilder jsonData = new StringBuilder();
            while ((i = inputStream.read()) != -1) {
                jsonData.append((char) i);
            }

            JSONArray usersArray = new JSONArray(jsonData.toString());
            for (int j = 0; j < usersArray.length(); j++) {
                JSONObject object = usersArray.getJSONObject(j);
                int id = object.getInt("id");
                String name, username, email, phone, website;
                name = object.getString("name");
                username = object.getString("username");
                email = object.getString("email");
                phone = object.getString("phone");
                website = object.getString("website");
                create.newUser(id, name, username, email, phone, website);
            }
            System.out.println(Thread.currentThread().getName() + " users data from jsonplaceholder received");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " successfully added to db");
        } catch (SQLException | ClassNotFoundException | InterruptedException | IOException throwables) {
            throwables.printStackTrace();
            System.out.println(Thread.currentThread().getName() + " thread unexpected error");
        }
    }

    public void getPostsFromJPH() {
        int i = 0;
        Create create = new Create();
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            StringBuilder jsonData = new StringBuilder();
            while ((i = inputStream.read()) != -1) {
                jsonData.append((char) i);
            }

            JSONArray postsArray = new JSONArray(jsonData.toString());
            for (int j = 0; j < postsArray.length(); j++) {
                JSONObject object = postsArray.getJSONObject(j);
                int id, userId;
                String title, body;
                id = object.getInt("userId");
                userId = object.getInt("id");
                title = object.getString("title");
                body = object.getString("body");
                create.newPost(userId, id, title, body);;
            }
            System.out.println(Thread.currentThread().getName() + " posts data from jsonplaceholder received");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " successfully added to db");
        } catch (IOException | SQLException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + " thread unexpected error");
        }
    }

    public void getCommentsFromJPH() {
        int i = 0;
        Create create = new Create();
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/comments");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            StringBuilder jsonData = new StringBuilder();
            while ((i = inputStream.read()) != -1) {
                jsonData.append((char) i);
            }

            JSONArray commentsArray = new JSONArray(jsonData.toString());
            for (int j = 0; j < commentsArray.length(); j++) {
                JSONObject object = commentsArray.getJSONObject(j);
                int id, postId;
                String name, email, body;
                postId = object.getInt("postId");
                id = object.getInt("id");
                name = object.getString("name");
                email = object.getString("email");
                body = object.getString("body");
                create.newComment(postId, id, name, email, body);
            }
            System.out.println(Thread.currentThread().getName() + " users data from jsonplaceholder received");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " successfully added to db");
        } catch (IOException | SQLException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + " thread unexpected error");
        }
    }
}

