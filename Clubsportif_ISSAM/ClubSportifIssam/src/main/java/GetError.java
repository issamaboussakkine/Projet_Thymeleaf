import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetError {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8086/activites/nouveau");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("Accept", "application/json");
            InputStream is = conn.getErrorStream();
            if (is != null) {
                System.out.println(new String(is.readAllBytes()));
            } else {
                System.out.println("No error stream, response code: " + conn.getResponseCode());
                System.out.println(new String(conn.getInputStream().readAllBytes()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
