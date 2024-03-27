package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        String[] str = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int sum = 0;

            for (int i = 1; i <= 12; i++) {
                if (i == 2)
                    map.put(i, 28);
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                    map.put(i, 30);
                else
                    map.put(i, 31);
            }

            for (int i = 1; i < x; i++)
                sum += map.get(i);

            sum += y;

            int day = sum % 7;
            System.out.println(str[day]);


    }
}
