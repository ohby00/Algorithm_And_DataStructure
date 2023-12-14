package Step4;
import java.util.HashSet;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;
public class B3052_1 {

    public static void main(String[] args) throws IOException {  // HashSet 사용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.print(h.size());
    }
}