package example16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/12
 */
public class ex01 {
    public static void main(String[] args) throws IOException {
        Map m = new HashMap();
        InetAddress host = InetAddress.getLocalHost();
        String hostAddress = host.getHostAddress();
        int pos = hostAddress.lastIndexOf(".");
        String wangduan = hostAddress.substring(0, pos+1);
        int i = 1;
        while (i<255){
            String ip = wangduan+i;
            Process process = Runtime.getRuntime().exec("ping " + ip + "-w 280 -n 1");
            InputStream is = process.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(is);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String lin = bufferedReader.readLine();
            while (lin != null){
                if (lin != null && !lin.equals("")){
                    if (lin.substring(0,2).equals("来自") || (lin.length() > 10 && lin.substring(0, 10).equals("Reply from"))){
                        m.put(ip, "true");
                        System.out.println(ip);
                    }
                }
                lin = bufferedReader.readLine();
            }
        }


        System.out.println("ip:"+hostAddress);
        System.out.println(wangduan);
    }
}
