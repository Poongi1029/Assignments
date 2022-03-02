package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Q6 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String u = "https://httpbin.org/get";
        HttpRequest r = HttpRequest.newBuilder().uri(URI.create(u))
                .GET().version(HttpClient.Version.HTTP_2).build();
        HttpClient t = HttpClient.newBuilder().build();
                try{
                    HttpResponse<String> rs =t.send(r, HttpResponse.BodyHandlers.ofString());
                    System.out.println(rs.headers());
                    System.out.println(rs.statusCode());
                    System.out.println(rs.body());

                }
                catch (IOException | InterruptedException e){
                    e.printStackTrace();
                }


    }
}
