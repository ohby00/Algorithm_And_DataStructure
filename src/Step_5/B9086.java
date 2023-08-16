package Step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str1 = br.readLine();
            sb.append(str1.charAt(0)).append(str1.charAt(str1.length()-1)).append("\n");
        }
        System.out.println(sb);
    }
}
