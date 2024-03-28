package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim(); // 문장 공백 지워줌
        System.out.println(counting(str));
    }

        static int counting(String str) {
            int count = 0;
         if (str.isEmpty()) // 문장이 비어있는 경우 0 출력
             return 0;
         else {
            for (int i = 0; i < str.length(); i++) {
                int a = (int) str.charAt(i);
                if (a == 32) // 아스키코드 공백 = 32
                    count++;
            }
             return count + 1;
         }
    }
}
