package Fast_cam.ch_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_07_1730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int x = 0;
        int y = 0;

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'D')
                y--;
            else if (str.charAt(i) == 'U') {
                if(y > 0)
                    y++;
            }
        }


    }
}
