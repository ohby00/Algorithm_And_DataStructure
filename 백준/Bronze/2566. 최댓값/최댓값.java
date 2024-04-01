import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[9][9];
        int max = 0;
        int count_x = 0;
        int count_y = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                int n = Integer.parseInt(st.nextToken());
                arr[i][j] = n;
                if(max < n){
                    max = n;
                    count_x = i;
                    count_y = j;
                }
            }
        }
        sb.append(max).append("\n").append(count_x+ 1).append(" ").append(count_y+ 1);
        System.out.println(sb);
    }
}