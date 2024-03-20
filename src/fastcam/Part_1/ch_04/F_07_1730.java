package fastcam.Part_1.ch_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_07_1730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // passVertical - 가로
        // passHorizontal - 세로
        boolean[][] passVertical = new boolean[N][N];
        boolean[][] passHorizontal = new boolean[N][N];
        int curX = 0, curY = 0;
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char cmd = str.charAt(i);
            if (cmd == 'D') {
                if(curX == N - 1)
                    continue;
                passHorizontal[curX][curY] = passHorizontal[curX + 1][curY] = true;
                curX++;
            } else if (cmd == 'U') {
                if(curX == 0)
                    continue;
                passHorizontal[curX][curY] = passHorizontal[curX - 1][curY] = true;
                curX--;
            } else if (cmd == 'L') {
                if(curY == 0)
                    continue;
                passVertical[curX][curY] = passVertical[curX][curY - 1] = true;
                curY--;
            } else if (cmd == 'R') {
                if(curY == N - 1)
                    continue;
                passVertical[curX][curY] = passVertical[curX][curY + 1] = true;
                curY++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (passVertical[i][j]) {
                    if(passHorizontal[i][j]) {
                        System.out.print('+');
                        continue;
                    }
                    System.out.print('-');
                } else if (passHorizontal[i][j]) {
                    if(passVertical[i][j]){
                        System.out.print('+');
                        continue;
                    }
                    System.out.print('|');
                }else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
