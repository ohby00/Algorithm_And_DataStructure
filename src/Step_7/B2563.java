package Step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        boolean arr[][] = new boolean[101][101];
        int total = 0;

        for (int i = 0; i < A; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for (int j = N; j < N + 10; j++) {
                for (int k = M; k < M + 10; k++) {
                    if(!arr[j][k]){
                     arr[j][k] = true;
                     total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
