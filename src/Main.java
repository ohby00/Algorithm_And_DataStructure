import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNumber = Integer.parseInt(br.readLine());
        int staff = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        int count = 0;

        for (int i = 0; i < staff; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char ch = st.nextToken().charAt(0);
            int chNumber = Integer.parseInt(st.nextToken());
            if(chNumber * 100 / totalNumber >= 5) {
                arr[ch - 65] = chNumber;
                count++;
            }
        }

        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j < 26; j++) {
                if(arr[i] != 0)
                    arr2[i]++;
            }
        }


        for (int i = 0; i < 26; i++) {
            if(arr[i] != 0)
                System.out.println((char)(i + 65) + " " + arr[i]);
        }
        System.out.println("--------------------------------------");

        for (int i = 0; i < 26; i++) {
            if(arr2[i] != 0)
                System.out.println((char)(i + 65) + " " + arr2[i]);
        }







    }
}
