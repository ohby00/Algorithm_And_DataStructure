package Step2;
import java.util.Scanner;

public class B14681 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > 0 && num2 > 0){
            System.out.println("1");
        } else if (num1 < 0 && num2 > 0) {
            System.out.println("2");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("3");
        } else if (num1 > 0 && num2 < 0) {
            System.out.println("4");
        }
    }
}