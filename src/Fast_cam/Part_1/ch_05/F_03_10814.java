package Fast_cam.Part_1.ch_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class F_03_10814 {
    static class Member implements Comparable<Member>{
        int age;
        String name;
        int idx;
        public Member(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }

        @Override
        public int compareTo(Member o) {
            if(age != o.age)
                return age - o.age;
            return idx - o.idx;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Member[] members = new Member[N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken(), i);
        }

        Arrays.sort(members);

        for(Member member : members)
            System.out.println(member.age + " " + member.name);
    }
}
