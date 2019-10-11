package example16;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/12
 */
public class Ex02 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com/");
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        System.out.println(urlConnection.getContentLength());
        System.out.println(urlConnection.getContent().toString());
        System.out.println(urlConnection.getContentEncoding());
        System.out.println(urlConnection.getDefaultUseCaches());

    }
}
