package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if(str1.length() - i < str2.length())
                break;

            for (int j = 0; j < str2.length() ; j++) {
                if(str1.charAt(i) == str2.charAt(j))
                    i++;
                if(j == str2.length() - 1)
                    count++;
            }

        }

        System.out.println(count);
    }
}
