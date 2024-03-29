package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        // int 로해서 개삽질했다...

        System.out.println(n*(n-1)*(n-2)/6);
        System.out.println(3); // 주어진 문제에서 추가로 요구한 출력
    }
}
