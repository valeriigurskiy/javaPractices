package javapractice9;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class getData {
    HttpURLConnection connection = null;
    public void getWeather(String cityName) throws IOException {
        String key = "239c7bff2fc5bf268d7fcb23759c06db";
        String cityResult = null;
        String countryResult = null;
        int temperatureNowResult = 0;
        int minimumTemperatureResult = 0;
        int maximumTemperatureResult = 0;
        int feelsLikeTemperatureResult = 0;
        int windSpeedResult = 0;
        int humidityResult = 0;
        String sunsetTimeResult = null;
        String sunriseTimeResult = null;
        String query = "http://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + key;
        try {
            connection = (HttpURLConnection) new URL(query).openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            connection.setConnectTimeout(250);
            connection.setReadTimeout(250);
            connection.connect();

            StringBuilder sb = new StringBuilder();
            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                String line;
                while ((line = in.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }

                JSONObject obj = new JSONObject(sb.toString());
                String city = obj.getString("name");
                String country = obj.getJSONObject("sys").getString("country");
                int temperature = obj.getJSONObject("main").getInt("temp");
                long sunsetTime = obj.getJSONObject("sys").getInt("sunset");
                long sunriseTime = obj.getJSONObject("sys").getInt("sunrise");
                int maxTemperature = obj.getJSONObject("main").getInt("temp_max");
                int minTemperature = obj.getJSONObject("main").getInt("temp_min");
                int feelsLikeTemperature = obj.getJSONObject("main").getInt("feels_like");
                int windSpeed = obj.getJSONObject("wind").getInt("speed");
                int humidity = obj.getJSONObject("main").getInt("humidity");

                cityResult = city;
                countryResult = country;
                temperatureNowResult = temperature - 273;
                maximumTemperatureResult = maxTemperature - 273;
                minimumTemperatureResult = minTemperature - 273;
                feelsLikeTemperatureResult = feelsLikeTemperature - 273;
                windSpeedResult = windSpeed;
                humidityResult = humidity;

                Date sunriseDate = new java.util.Date(sunriseTime * 1000L);
                SimpleDateFormat sunriseUnixToTime = new java.text.SimpleDateFormat("HH:mm z");
                String formatedSunriseTime = sunriseUnixToTime.format(sunriseDate);
                sunriseTimeResult = formatedSunriseTime.substring(0, formatedSunriseTime.length() - 3);

                Date sunsetDate = new java.util.Date(sunsetTime * 1000L);
                SimpleDateFormat sunsetUnixToTime = new java.text.SimpleDateFormat("HH:mm z");
                String formatedSunsetTime = sunsetUnixToTime.format(sunsetDate);
                sunsetTimeResult = formatedSunsetTime.substring(0, formatedSunriseTime.length() - 3);

                System.out.println("\uD83C\uDF06City: " + cityResult + "\n"
                        + "Country: " + countryResult + "\n"
                        + "\uD83C\uDF21Temperature: " + temperatureNowResult + "\n"
                        + "\uD83C\uDF21Temperature feels like: " + feelsLikeTemperatureResult + "\n"
                        + "⬆\uD83C\uDF21Maximum temperature today: " + maximumTemperatureResult + "\n"
                        + "⬇\uD83C\uDF21Minimal temperature today: " + minimumTemperatureResult + "\n"
                        + "☀Sunrise: " + sunriseTimeResult + "\n"
                        + "\uD83C\uDF11Sunset: " + sunsetTimeResult + "\n"
                        + "\uD83D\uDCA8Wind speed: " + windSpeedResult + " meter/sec" + "\n"
                        + "\uD83D\uDCA6Humidity: " + humidityResult + "%" + "\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
