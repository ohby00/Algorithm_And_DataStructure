import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution();
    }
    public static void solution() {
        int[] arr =  {5, 1, 4};

        int N = Arrays.stream(arr).sum();
        int[] answer = new int[N];
        int M = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = M; j < arr[i]; j++){
                answer[M++] = arr[i];
            }
        }

        for (int a : answer) {
            System.out.println(a);
        }
    }
}


