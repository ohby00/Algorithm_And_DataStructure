package Step_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
    public class B3003 {
        public static void main(String[] args)throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            StringBuilder sb = new StringBuilder();

            int arr_b[] = {1, 1, 2, 2, 2, 8};
            int arr_w[] = new int[6];

            for (int i = 0; i < 6; i++) {
                arr_w[i] = Integer.parseInt(st.nextToken());
                arr_w[i] = arr_b[i] - arr_w[i];
                sb.append(arr_w[i]).append(" ");
            }
            System.out.println(sb);
        }
    }