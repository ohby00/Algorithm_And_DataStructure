package Fast_cam.Part_2.ch_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class F_02_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < K; j++)
                q.add(q.poll());
            ans[i] = q.poll();
        }
        System.out.print("<" + Arrays.stream(ans)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + ">");
    }
}
