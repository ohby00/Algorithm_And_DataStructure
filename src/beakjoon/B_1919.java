package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();

        int[] arr = new int[26];
        int[] arr2 = new int[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            arr[ str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr2[ str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
                int n = arr[i] - arr2[i];
                count += Math.abs(n);
        }
        System.out.println(count);
    }
}
