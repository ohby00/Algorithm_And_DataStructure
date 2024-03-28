package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class B_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new TreeSet<>();
        String str = br.readLine();
        int N = 0;
        int M = 1;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - N; j++) {
                set.add(str.substring(j,j+M));
            }
            N++;
            M++;
        }
        System.out.println(set.size());
    }
}
