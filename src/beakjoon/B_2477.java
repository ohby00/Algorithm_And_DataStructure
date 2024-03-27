package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        int big_x = 0;
        int small_x = 0;
        int big_y = 0;
        int small_y = 0;

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int location = Integer.parseInt(st.nextToken());
            int meter = Integer.parseInt(st.nextToken());
            if (location == 1 || location == 2) {
                if (big_x < meter)
                    big_x = meter;

                if (small_x > meter || small_x == 0)
                    small_x = meter;
            } else {
                if (big_y < meter)
                    big_y = meter;

                if (small_y > meter || small_y == 0)
                    small_y = meter;
            }
        }
        int total = (big_x * big_y) - (small_x * small_y);
        total *= K;
        System.out.println(total);
    }
}

