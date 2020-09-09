package javapractice8;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;

public class MainMethod {
    public static void main(String[] args) {
        Get get = new Get();
//        get.getUsersFromJPH();
//        get.getPostsFromJPH();
        get.getCommentsFromJPH();
        Create create = new Create();


    }
}
