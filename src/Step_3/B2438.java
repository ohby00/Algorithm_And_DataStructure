package Step3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2438 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            sb.append("*");
            System.out.println(sb);
        }
        sb.append("\n");
    }
}