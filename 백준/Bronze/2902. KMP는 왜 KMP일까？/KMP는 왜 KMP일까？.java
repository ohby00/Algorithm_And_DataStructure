import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i);
            if(n == 45)
                sb.append(str.charAt(i+1));
        }

        System.out.println(sb);
    }
}





