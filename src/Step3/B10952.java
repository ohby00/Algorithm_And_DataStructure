package Step3;
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class B10952 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String str1 = br.readLine();

            int a = str1.charAt(0) - '0';
            int b = str1.charAt(2) - '0';
            sb.append(a + b).append("\n");
            if(a == 0 && b == 0){
                break;
            }

        }
        System.out.println(sb);
    }
}