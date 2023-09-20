package Step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10798 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr[][] = new char[5][15];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String str1 = br.readLine();
            int N = str1.length();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str1.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] == ' ' || arr[j][i] == '\0')
                    continue;
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}