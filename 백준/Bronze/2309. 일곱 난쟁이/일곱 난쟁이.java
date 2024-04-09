import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            // 정렬 해야하니까 배열에 넣고
            arr[i] = Integer.parseInt(br.readLine());
            // 총 값에서 2개를 뺀게 100인거를 구하는게 최적 알고리즘
            sum += arr[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    // 7개의 총합이 100인 경우 기록
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    // 정렬하면 어차피 0,1 자리는 0값이니까
                    for (int k = 2; k < 9; k++) {
                        // 2 ~ 9 자리 출력
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}