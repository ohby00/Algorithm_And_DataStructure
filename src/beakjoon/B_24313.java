package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int f_n = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n_0 = Integer.parseInt(br.readLine());

        int a = f_n * n_0 + n;
        int b = c * n_0;

        System.out.println(a <= b ? 1 : 0);

    }
}
