package beakjoon;

import java.io.*;

public class B_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        int max = 0;
        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 97){
                arr[str.charAt(i) - 'a']++;
            }else
                arr[str.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if(max < arr[i]){
                max = arr[i];
                n = i;
            }else if(max == arr[i] && arr[i] != 0)
                n = -2;
        }

        System.out.println((char)(n + 65));
    }
}
