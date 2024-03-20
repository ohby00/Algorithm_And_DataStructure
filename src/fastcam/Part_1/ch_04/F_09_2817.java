package fastcam.Part_1.ch_04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2817
public class F_09_2817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNumber = Integer.parseInt(br.readLine());
        int staff = Integer.parseInt(br.readLine());
        int[][] arr = new int[26][15];
        int[] arr2 = new int[26];

        for (int i = 0; i < staff; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char ch = st.nextToken().charAt(0);
            int chNumber = Integer.parseInt(st.nextToken());
            if (chNumber * 100 / totalNumber >= 5) {
                for (int j = 1; j <= 14; j++) {
                    arr[ch - 65][j] = chNumber / j;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 15; j++) {
                if(arr[i][j] != 0)
                    System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }





    }
}
