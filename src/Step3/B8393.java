package Step3;

import java.util.Scanner;

public class B8393 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int sum = 0;
        in.close();

        for (int i = 1; i <= num1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
