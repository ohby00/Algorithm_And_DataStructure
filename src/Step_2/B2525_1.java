package Step2;
import java.util.Scanner;
public class B2525_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        int M_m = in.nextInt();
        in.close();
        int total_m = M + M_m;

        if(total_m > 60) {
            int total_n = total_m / 60;
            H = H + total_n;
            if(H == 24){
                H = 0;
            }
            System.out.println(H + " " + total_m % 60 );
        }else {
            if(H == 24){
                H = 0;
            }
            System.out.println(H + " " + total_m);
        }
    }
}
