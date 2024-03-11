package Fast_cam.Part_1.ch_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class F_05_3273 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());

        boolean[] exist = new boolean[1000001];
        for (int i = 0; i < n; i++) {
            exist[arr[i]] = true;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int pairValue = X - arr[i];
            if(0 <= pairValue && pairValue <= 1000000)
                ans += exist[pairValue] ? 1 : 0;
        }
        System.out.println(ans / 2);
    }
}