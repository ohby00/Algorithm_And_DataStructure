package Step_7;
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class B2566 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A_n = 0;
        int max_n = 0;
        int x = 0;
        int y = 0;

        int arr[][] = new int[9][9];

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < 9; j++) {
                A_n = Integer.parseInt(st.nextToken());
                arr[i][j] = A_n;

                if(max_n <= A_n){
                    max_n = A_n;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        sb.append(max_n).append("\n");
        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }
}