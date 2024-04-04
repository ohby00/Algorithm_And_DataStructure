import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
        최소큐 만들어서 최소값 2 개를 곱해서 값을 바꿔주면 끝..?
        쉬워보이는데 풀어봐야할듯
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        // 3, 2, 6 일때
        // 2, 3, 6 -> 2 + 3 = 5
        // 5, 5, 6 -> 다 더하면 16
        st = new StringTokenizer(br.readLine(), " ");
        int card_cut = Integer.parseInt(st.nextToken());
        int card_cls = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < card_cut; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < card_cls; i++) {
            Long a = pq.poll();
            Long b = pq.poll();
                // 계산한 값을 x번 카드와 y번 카드 두 장 모두에 덮어 쓴다.
            pq.offer(a + b);
            pq.offer(a + b);
        }

        long total = 0;

        while(!pq.isEmpty()) {
            total+=pq.poll();
        }

        sb.append(total);
        System.out.println(sb);

    }
}