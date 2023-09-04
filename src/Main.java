import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String arr[][] = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String str1 = st.nextToken();
            char A = str1.charAt(i);
            for (int j = 0; j < 15; j++) {
                arr[i][j] = String.valueOf(A);
                sb.append(arr[i][j]);
            }
        }
        System.out.println(sb);
    }
}