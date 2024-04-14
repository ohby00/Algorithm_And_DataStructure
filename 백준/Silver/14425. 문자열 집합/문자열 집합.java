import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add((st.nextToken()));
        }

        int num = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (list.contains(str)) {
                num++;
            }
        }
        System.out.println(num);
    }
}