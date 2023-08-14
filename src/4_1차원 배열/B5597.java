package Step4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B5597 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean arr[] = new boolean[31];

        for (int i = 1; i <= 28; i++) {
            int A = Integer.parseInt(br.readLine());
            arr[A] = true;
        }
        for (int i = 1; i <= 30; i++) {
            if(!arr[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
