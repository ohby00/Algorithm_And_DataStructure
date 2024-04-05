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

        st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[K];

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 최대값
        long max = Arrays.stream(arr).max().orElseThrow();

        long start = 1;
        long end = max;

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = Arrays.stream(arr).map(e -> e / mid).sum();

            if (sum >= N) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}