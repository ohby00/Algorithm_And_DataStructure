package Fast_cam.ch_05;

import java.io.*;
import java.util.*;

public class F_06_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] xs = new int[N];
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            xs[i] = Integer.parseInt(st.nextToken());
            set.add(xs[i]);
        }
        for(int y : xs)
            System.out.print( y + " ");
        System.out.println("xs");
        System.out.println();

        for(int y : set)
            System.out.print( y +" ");
        System.out.println("set");
        System.out.println();

        Map<Integer, Integer> sortedIndex = new HashMap<>();
        int idx = 0;
        for(int x : set)
            sortedIndex.put(x, idx++);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++)
            bw.write(sortedIndex.get(xs[i]) + " ");
        bw.flush();
        bw.close();
    }
}

