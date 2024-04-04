import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        st = new StringTokenizer(br.readLine());
        // 첫줄을 넣어줌
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            pq.offer(num);
        }

        for(int i = 1; i < N; i++) {
            // 첫줄 넣어줬으니까 1부터 시작
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());

                if(pq.peek() < num) {  // 추가
                    pq.poll();
                    pq.offer(num);
                }
            }
        }

        System.out.println(pq.poll());
    }
}