package beakjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = "";
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    str += S.charAt(i);
                }
            }

            bw.write(str + "\n");
            bw.flush();
        }
        bw.close();
    }
}
