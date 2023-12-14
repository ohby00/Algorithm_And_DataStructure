package Setp_p.Step_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = new String[20];
        double grade_num[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0,0.0};
        String grade[] = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
        double num1 = 0;
        String grade_my;
        double total = 0;
        double to_score = 0;

        for (int i = 0; i < 20; i++) {
            arr[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(arr[i]," ");
            String subject = st.nextToken();
            num1 = Double.parseDouble(st.nextToken());
            grade_my = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if(grade_my.equals(grade[j])){
                    total += num1 * grade_num[j];
                    if(j != 9){
                        to_score += num1;
                    }
                }
            }
        }

        double average = total / to_score;
        System.out.printf("%.6f\n", average);


    }
}
