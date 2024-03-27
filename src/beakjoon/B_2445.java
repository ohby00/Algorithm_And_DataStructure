package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // 오른쪽 위 직각 삼각형 공백 만들어주기
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            // 왼쪽 위 직각 삼각형 공백 만들어주기
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 왼쪽 위 직각 삼각형
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print("*");
            }
            // 오른쪽 아래 직각 삼각형 공백 만들어주기
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 왼쪽 아래 직각 삼각형 공백 만들어주기
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
