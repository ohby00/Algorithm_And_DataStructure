package fastcam.Part_1.ch_05;

import java.io.*;
import java.util.*;

public class F_07_2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int message = Integer.parseInt(st.nextToken());
            map.put(message, map.getOrDefault(message, 0) + 1);
        }

        Integer[] frequencies = map.keySet().toArray(new Integer[map.size()]);
        Arrays.sort(frequencies, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });

        for (int frequency : frequencies) {
            int count = map.get(frequency);
            while (count-- > 0) {
                bw.write(frequency + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
