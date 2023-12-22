package Fast_cam.ch_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_04_1157 {

    private static int[] getAlphabetCount(String str1) {
        int[] arr_A = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch > 96)
                arr_A[ch - 'a']++;
            else
                arr_A[ch - 'A']++;
        }
        return arr_A;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();

        int[] count_A = getAlphabetCount(str1);

        int maxCount = 0;
        char maxAlphabet = '?';

        for (int i = 0; i < 26; i++) {
            if(count_A[i] > maxCount) {
                maxCount = count_A[i];
                maxAlphabet = (char) ('A' + i);
            } else if (count_A[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }
}
