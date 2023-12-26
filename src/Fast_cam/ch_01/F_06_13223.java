package Fast_cam.ch_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class F_06_13223 {
    public static String[] split_array (String str1){
        String[] split_AB;
        split_AB = str1.split(":");
        return split_AB;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        split_array(str1);

    }
}
