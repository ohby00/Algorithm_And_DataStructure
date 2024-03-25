package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_13223 {
    static int time(int h, int m, int s){
        int total = 0;
        total += h * 3600;
        total += m * 60;
        total += s;
        return total;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nowTime = br.readLine();
        String laterTime = br.readLine();
        int time = 0;

        String[] arr = nowTime.split(":");
        String[] arr1 = laterTime.split(":");


            int now = time(Integer.parseInt(arr[0]),
                            Integer.parseInt(arr[1]),
                            Integer.parseInt(arr[2]));

              int later = time(Integer.parseInt(arr1[0]),
                             Integer.parseInt(arr1[1]),
                             Integer.parseInt(arr1[2]));
       if(now < later)
           time = later - now;
       else
           time = (86400 + later) - now;

        int h = time / 3600;
        int m = (time % 3600) / 60;
        int s = time - (h * 3600 + m * 60);
        System.out.println(String.format("%02d:%02d:%02d", h, m, s));
    }
 }

