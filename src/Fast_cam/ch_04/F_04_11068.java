package Fast_cam.ch_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_04_11068 {
    public static int[] convertBase(int x, int B) {
        int len = 0, copyX = x;
        while (copyX > 0) {
            copyX /= B;
            len++;
        }

        int[] digit = new int[len];
        len = 0;
        while (x > 0) {
            digit[len++] = x % B;
            x = x / B;
        }
        return digit;
    }

    public static boolean isPalindrome(int[] digit) {
        for (int i = 0; i < digit.length / 2; i++)
            if (digit[i] != digit[digit.length - i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int x = Integer.parseInt(br.readLine());
            boolean ans = false;
            for (int i = 2; i <= 64; i++) {
                int[] digit = convertBase(x, i);
                if (isPalindrome(digit)) {
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? "1" : "0");
        }
    }
}
