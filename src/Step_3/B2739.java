package Step3;
import java.util.Scanner;
public class B2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        in.close();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num1 + " * " + i + " = " + (num1 * i) );

        }
    }
}