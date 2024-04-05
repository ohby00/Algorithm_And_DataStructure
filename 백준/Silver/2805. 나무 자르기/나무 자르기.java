import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    블로그 참고
    아이디어는 얼추 맞췄는데 이분 탐색 구현을 아직 할 줄 모름
    결국 가장 큰 값의 절반값으로 시작을해서 탐색을 돈다
    절반값으로 나머지를 빼줄 때 나오는 값 기준으로 만약 
    빼준 값 다 더함 = A
    A > M 이라면  min = mid + 1 해줘서 최솟값을 올림
    A < M 이라면 max = mid 해줘서 최대값을 낮춰줌
    결국 min >= max 되는 경우 그게 정답
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tree = new int[N];
        int min = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if(max < tree[i]) {
                max = tree[i];
            }
        }
        while(min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for(int treeHeight : tree) {
                if(treeHeight - mid > 0) {
                    sum += (treeHeight - mid);
                }
            }
            if(sum < M) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}