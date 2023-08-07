package Step3;
import java.util.Scanner;
public class B25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total_num = in.nextInt();
        int kind_num = in.nextInt();
        int arr[] = new int[kind_num];
        int sum = 0;

        for (int i = 0; i < kind_num; i++) {
            int price = in.nextInt();
            int price_num = in.nextInt();

            arr[i] = price * price_num;
        }
        for(int k : arr){
            sum += k;
        }
        if(total_num == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
