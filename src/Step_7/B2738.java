package Step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2738 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int num_A = Integer.parseInt(st.nextToken());
        int num_B = Integer.parseInt(st.nextToken());

        int arr[][] = new int[num_A][num_B];

        for (int i = 0; i < num_A; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num_B; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < num_A; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num_B; j++) {
                sb.append(arr[i][j] + Integer.parseInt(st.nextToken()) + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
