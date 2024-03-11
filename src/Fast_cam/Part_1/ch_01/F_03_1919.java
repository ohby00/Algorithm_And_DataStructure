package Fast_cam.Part_1.ch_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_03_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] A_arr = new int[26];
        int[] B_arr = new int[26];

        for (int i = 0; i < str1.length(); i++)
            A_arr[str1.charAt(i) - 'a']++;

        for (int i = 0; i < str2.length() ; i++)
            B_arr[str2.charAt(i) - 'a']++;

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if(A_arr[i] > B_arr[i])
                count += A_arr[i] - B_arr[i];
            else if (B_arr[i] > A_arr[i])
                count += B_arr[i] - A_arr[i];
        }
        System.out.println(count);
    }
}
