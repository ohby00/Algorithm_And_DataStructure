package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new TreeSet<>();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String log = st.nextToken();
            if(log.equals("enter"))
                set.add(name);
            else
                set.remove(name);
        }

        String[] name = set.toArray(new String[set.size()]);
        for (int i = name.length - 1; i >= 0 ; i--) {
            System.out.println(name[i]);
        }



    }
}

