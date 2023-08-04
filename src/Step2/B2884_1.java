package Step2;
import java.util.Scanner;

public class B2884_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();

        if(num1 == 0){
            num1 = 24;
        }

        num1 = num1 * 60;
        int total_num = num1 + num2;
        total_num = total_num - 45;

        num1 = total_num / 60;
        num2 = total_num % 60;

        System.out.println(num1 +" "+ num2);

    }
}