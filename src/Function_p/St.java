package Function_p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class St {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        System.out.println(sb);
    }
}
