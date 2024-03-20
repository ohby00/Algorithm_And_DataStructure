package beakjoon;

import java.io.*;

public class B_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            int a = (int)str.charAt(i);
            if(a >= 97)
                a = a - 32;
            else
                a = a + 32;
            str2 += (char)a;
        }
        sb.append(str2);
        System.out.println(sb);
    }
}
