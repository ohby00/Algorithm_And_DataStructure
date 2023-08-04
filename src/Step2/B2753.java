package Step2;

import java.util.Scanner;
public class B2753 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        in.close();

        if(num1 % 4 ==0){
            if(num1 % 400 ==0){
                System.out.println("1");
            } else if (num1 % 100 == 0) {
                System.out.println("0");
            }else {
                System.out.println("1");
            }
        }else {
            System.out.println("0");
        }
    }
}