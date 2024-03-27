package beakjoon;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int firstNum = Integer.parseInt(st.nextToken());
        int secondNum = Integer.parseInt(st.nextToken());
        int thirdNum = Integer.parseInt(st.nextToken());
        int total = 0;

        if(firstNum == secondNum && secondNum == thirdNum)
            total = 10000 + firstNum * 1000;
        else if(firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum)
            total = 1000 + (firstNum == secondNum ? firstNum : (firstNum == thirdNum ? firstNum : secondNum)) * 100;
        else
            total = mixMax(firstNum, secondNum, thirdNum) * 100;

        bw.write(total + "\n");
        bw.flush();
        bw.close();
    }
    static int mixMax(int a,int b,int c) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);

        return arr[2];
    }
}
