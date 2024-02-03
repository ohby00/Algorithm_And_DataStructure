package Fast_cam.ch_04;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class F_05_3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int totalNumber = 0;
            int minNumber = 0;

            int[] arr = new int[7];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 7; i++) {
                int number = Integer.parseInt(st.nextToken());
                if (number % 2 == 0) {
                    totalNumber += number;

                    arr[i] = number;
                }
            }
            Arrays.sort(arr);
            System.out.println(totalNumber + " " + arr[0]);
        }
    }
}
