
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[N][M];
        int Num_N = 0;
        int Num_M = 0;


        for (int i = 0; i < N ; i++) {
            String str1 = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str1.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            int Num_X = 0;
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 'X')
                  Num_X++;
            }
            if(Num_X == 0)
                Num_N++;
        }

        for (int i = 0; i < M; i++) {
            int Num_X = 0;
            for (int j = 0; j < N; j++) {
                if(arr[j][i] == 'X')
                    Num_X++;
            }
            if(Num_X == 0)
                Num_M++;
        }
        System.out.println(Math.max(Num_N,Num_M));
    }
}
