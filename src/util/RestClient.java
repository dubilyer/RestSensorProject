package util;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import javax.xml.ws.http.HTTPException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by dubilyer on 11/20/16.
 */
public class RestClient {
    public final String url = "http://login.etherios.com";
    private final String userName = "nanri-test";
    private final String password = "!Nanri0118";

    public String doGet(String path) throws IOException, HTTPException {
        URL url = new URL(this.url+path);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        String token = "Basic " + Base64.encode((userName+":"+password).getBytes());
        con.setRequestProperty("Authorization", token);
        con.setRequestProperty("Content-type","text/xml;charset=\"UTF-8\"");
        int responseCode = con.getResponseCode();
        if (responseCode!=200){
            throw new HTTPException(responseCode);
        }
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
}
