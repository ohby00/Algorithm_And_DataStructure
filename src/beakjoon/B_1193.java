package beakjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int C_count = 1;
        int S_count = 0;

        while (true) {
            if (X <= C_count + S_count) {
                if(C_count % 2 == 0) {
                    System.out.println((X - S_count) + "/" + (C_count - (X - S_count - 1)));
                    break;
                }else {
                    System.out.println(C_count - (X - S_count - 1) + "/" + (X = S_count));
                    break;
                }
            } else {
                S_count += C_count;
                C_count++;
            }
        }



    }
}

