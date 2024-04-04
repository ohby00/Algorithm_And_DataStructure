import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int num = 0;
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String clothes = st.nextToken();
                String kinds = st.nextToken();
                map.put(kinds, map.getOrDefault(kinds, 0) + 1);
            }
            int number = 1;
            for (int a : map.values()) {
                number *= (a + 1);
            }
            System.out.println(number - 1);
        }
    }
}