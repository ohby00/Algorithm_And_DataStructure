package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class B_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Double[] arr = new Double[M];
        double num = 0;
        double sum = 0;
        for (int i = 0; i < M; i++)
            arr[i] = (Double.parseDouble(st.nextToken()));

        Arrays.sort(arr);
        Double max = arr[M-1];

        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] / max * 100;


        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        num = sum / (double)arr.length;
        System.out.println(num);




    }
}
