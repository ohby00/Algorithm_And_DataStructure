import java.io.*;
import java.util.*;

public class Main {
    /*
     해쉬 맵 입력을 받아와서 높이가 변화하는 지점으로 끊어서 넓이를 구해보자
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> o2 - o1));

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        String answer = "NO";
        int cnt = 0;
        int num = 0;
        for (int i = 0; i < T; i++) {
            // 최장신이 나보다 작거나 1일경우 break;
            if ((pq.peek() < H) || (pq.peek() == 1)) {
                break;
            }
            cnt++;
            pq.offer(pq.poll() / 2);
        }

        if (pq.peek() < H) {
            answer = "YES";
            num = cnt;
        } else {
            answer = "NO";
            num = pq.poll();
        }

        sb.append(answer).append("\n").append(num);
        System.out.println(sb);
    }
}




