package Setp_p.Step_6;
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = 0;

        String str1 = br.readLine();
        String str2 = new StringBuilder(str1).reverse().toString();

        boolean A = str1.equals(str2);
        if(A == true){
            N = 1;
        }else {
            N = 0;
        }

        sb.append(N);
        System.out.println(sb);
    }
}