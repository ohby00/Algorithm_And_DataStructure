package Step2;

import java.util.Scanner;


public class B9498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.println((num1 >= 90) ? "A" : (num1 >= 80) ? "B" : (num1 >= 70) ? "C" : (num1 >= 60) ? "D" : "F"  );
    }
}
