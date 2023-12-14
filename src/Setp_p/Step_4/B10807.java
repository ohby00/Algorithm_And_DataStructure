package Step4;
import java.io.*;
import java.util.StringTokenizer;
public class B10807 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(M == arr[i]){
                count++;
            }
        }
        br.close();
        bw.write(count + "\n");
        bw.flush();
        bw.close();

    }
}
