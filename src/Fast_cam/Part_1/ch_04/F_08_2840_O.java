package Fast_cam.Part_1.ch_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class F_08_2840_O {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[] arr_ch = new char[N];
        char[] arr_che = new char[K];
        char[] arr_ch2 = new char[N];
        int num = 0;
        int fixnum = 0;

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int changeNum = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);
            arr_che[i] = ch;
            num += changeNum;
            if(num >= N)
                num -= N;
            arr_ch[num] = ch;
            if(i == K - 1)
                fixnum = num;
        }
        for (int i = 0; i < arr_ch2.length; i++) {
            if(fixnum < 0)
                fixnum += arr_ch2.length;
            arr_ch2[i] = arr_ch[fixnum--];
        }

        boolean obw = false;

        for (int i = 0; i < arr_ch.length; i++) {
            int count = 0;
            for (int j = 0; j < arr_ch2.length ; j++) {
                if(arr_che[i] == arr_ch2[j])
                    count++;
              }
            if(count==0) {
                System.out.println("!");
                obw = true;
                break;
            }
        }

        if(!obw) {
            for (int l = 0; l < arr_ch2.length; l++) {
                if (arr_ch2[l] == 0)
                    arr_ch2[l] = '?';
                System.out.print(arr_ch2[l]);
            }
        }
    }
}

