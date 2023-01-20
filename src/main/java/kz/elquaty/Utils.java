package kz.elquaty;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Utils {

    public void getpost(String textlog) throws Exception {


        // `HttpURLConnection` connection = (HttpURLConnection) url.openConnection();
        // connection.setRequestMethod("GET");

        String q = textlog;
        String urllog = "http://api.kex888.kz/sendtestlog.php?textlog=" + URLEncoder.encode(q, StandardCharsets.UTF_8);

        URL url = new URL(urllog);
        URLConnection connection = url.openConnection();


        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

}
