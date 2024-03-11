package Fast_cam.Part_1.ch_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class F_03_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String ans = "";
        while (N > 0) {
            int digit = N % B;
            if(digit < 10)
                ans += digit;
            else
                ans += (char) ('A' + digit - 10);
            N /= B;
        }
        for (int i = ans.length() - 1; i >= 0; i--) {
            sb.append(ans.charAt(i));

        }
        System.out.println(sb);
    }
}
