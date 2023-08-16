package Step3;

import java.util.Scanner;

public class B10950 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num1 = in.nextInt();
     int arr[] = new int[num1];

        for (int i = 0; i < num1; i++) {
            int num2 = in.nextInt();
            int num3 = in.nextInt();
            arr[i] = num2 + num3;
        }
        in.close();

        for(int k : arr){
            System.out.println(k);
        }
    }
}
