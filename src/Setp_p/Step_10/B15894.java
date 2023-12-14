package Setp_p.Step_10;
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;
public class B15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Integer.parseInt(br.readLine());
        A = A * 4;
        System.out.println(A);
    }
}
