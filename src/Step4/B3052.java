package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean arr[] = new boolean[41];

        for (int i = 0; i < 10; i++) {
            int A = (Integer.parseInt(br.readLine()) % 42);
            arr[A] = true;
        }

        int count = 0;
        for(boolean t: arr){
            if(t == true){
                count++;
            }
        }
        System.out.println(count);
    }
}