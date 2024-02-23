package Fast_cam.ch_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class F_05_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String title = br.readLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }

        String maxTitle = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> title : map.entrySet()) {
            String titleName = title.getKey();
            int count = title.getValue();
            if (count > maxCount ||
                     )
        }
    }
}
