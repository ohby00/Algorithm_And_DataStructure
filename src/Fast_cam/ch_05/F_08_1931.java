package Fast_cam.ch_05;

import java.io.*;
import java.util.*;

public class F_08_1931 {
    static class Meeting{
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Meeting[] meetings = new Meeting[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            meetings[i] = new Meeting(i1, i2);
        }

            Arrays.sort(meetings, new Comparator<Meeting>() {
                @Override
                public int compare(Meeting o1, Meeting o2) {
                    if(o1.end == o2.end)
                        return o1.start - o2.start;
                    return o1.end - o2.end;
                }
            });

            int cnt = 0;
            int ended = 0;
            for (Meeting meeting : meetings) {
                if (ended <= meeting.start) {
                    cnt++;
                    ended = meeting.end;
                }
            }
            System.out.println(cnt);
    }
}
