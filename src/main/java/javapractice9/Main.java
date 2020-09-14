package javapractice9;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        getData data = new getData();
        try{
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter city name: ");
            String cityName = obj.nextLine();
            data.getWeather(cityName);
            if(data.connection.getResponseCode() != HttpURLConnection.HTTP_OK){
                System.out.println("This city does not exist");
            }

        } catch (NullPointerException e){
            e.printStackTrace();
        }


    }
}
