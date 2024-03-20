package fastcam.Part_1.ch_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class F_02_1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] arr_NM = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == '.')
                    arr_NM[i][j] = true;
                else arr_NM[i][j] = false;
            }
        }

        int countNum = 0;

        if (N > M) {
            for (int i = 0; i < N; i++) {
                int count = 1;
                for (int j = 0; j < M; j++) {
                    if (arr_NM[i][j]) {
                        count++;
                    }
                }
                if (count == M)
                    countNum++;
            }
        } else {
            for (int i = 0; i < M; i++) {
                int count = 1;
                for (int j = 0; j < N; j++) {
                    if (!arr_NM[j][i]) {
                        count++;
                    }
                }
                if (count == M)
                    countNum++;
            }
            System.out.println(countNum);
        }
    }
}

