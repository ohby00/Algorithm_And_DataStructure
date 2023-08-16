package Step3;
import java.util.Scanner;
public class B25314 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        num = num / 4;

        for (int i = 0; i < num; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
