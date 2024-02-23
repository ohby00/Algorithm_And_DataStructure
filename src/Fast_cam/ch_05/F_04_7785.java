package Fast_cam.ch_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class F_04_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new TreeSet<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter"))
                set.add(name);
            else set.remove(name);
        }
        String[] orderName = set.toArray(new String[set.size()]);
        for (int i = orderName.length - 1; i >= 0; i--) {
            System.out.println(orderName[i]);
        }

    }
}
