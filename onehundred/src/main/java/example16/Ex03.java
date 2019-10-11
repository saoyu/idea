package example16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/12
 */
public class Ex03 {
    public static void main(String[] args) {
        String url = new Scanner(System.in).nextLine();
        System.out.println(getURL(url.toString()));
    }
    public static Collection<String> getURL(String urlStr){
        URL url = null;
        URLConnection connection = null;
        Collection<String> collection = new ArrayList<String>();
        try {
            url = new URL(urlStr);
            connection = url.openConnection();
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = bufferedReader.readLine();
            while (str != null){
                collection.add(str);
                str = bufferedReader.readLine();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return collection;
    }
}
