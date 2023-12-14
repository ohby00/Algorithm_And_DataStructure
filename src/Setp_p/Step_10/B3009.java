package Setp_p.Step_10;
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;
        import java.util.StringTokenizer;

public class B3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[3];
        int arr_1[] = new int[3];

        for (int i = 0; i < 3 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            arr[i] = N;
            arr_1[i] = M;
        }

        if(arr[0] == arr[1]){
            System.out.print(arr[2] + " ");
        } else if (arr[0] == arr[2]) {
            System.out.print(arr[1] + " ");
        }else {
            System.out.print(arr[0] + " ");
        }

        if(arr_1[0] == arr_1[1]){
            System.out.println(arr_1[2]);
        } else if (arr_1[0] == arr_1[2]) {
            System.out.println(arr_1[1]);
        }else {
            System.out.print(arr_1[0]);
        }
    }
}
