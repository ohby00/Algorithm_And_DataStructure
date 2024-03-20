package fastcam.Part_1.ch_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_02_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1  = br.readLine();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch < 97)
                System.out.print(ch += 32);
            else
                System.out.print(ch -= 32);
        }
    }
}
