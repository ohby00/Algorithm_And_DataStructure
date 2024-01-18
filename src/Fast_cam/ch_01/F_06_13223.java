package Fast_cam.ch_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_06_13223 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int nowHourNum = 0;
        int dropTime = 0;
        int result = 0;

        String[] split_1 = str1.split(":");
        String[] split_2 = str2.split(":");

        for (int i = 0; i < 3 ; i++) {
            if( i == 0){
                nowHourNum += Integer.parseInt(split_1[0]) * 3600;
                dropTime += Integer.parseInt(split_2[0]) * 3600;
            } else if (i == 1) {
                nowHourNum += Integer.parseInt(split_1[1]) * 60;
                dropTime += Integer.parseInt(split_2[1]) * 60;
            }else {
                nowHourNum += Integer.parseInt(split_1[2]);
                dropTime += Integer.parseInt(split_2[2]);
            }
        }
        if(nowHourNum < dropTime) {
            result = dropTime - nowHourNum;
        }else {
            result = (86400 + dropTime) - nowHourNum;
        }

        int H_num  = 0;
        int M_num = 0;
        int S_num = 0;

        H_num = result / 3600;
        M_num = (result % 3600) / 60;
        S_num = result - (H_num * 3600) - (M_num * 60);


        System.out.println(String.format("%02d:%02d:%02d", H_num, M_num, S_num));
    }
}
