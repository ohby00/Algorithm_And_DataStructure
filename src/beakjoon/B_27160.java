package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class B_27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        boolean flag = false;

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String card = st.nextToken(); // 과일 카드
            int num = Integer.parseInt(st.nextToken()); // 카드 넘버
            map.put(card, map.getOrDefault(card, 0) + num);
        }

        Iterator<String> key = map.keySet().iterator();
        while (key.hasNext()) {
            String strKey = key.next(); // 키를 가져옴
            Integer age = map.get(strKey); // 키 - 값 조회
            if(age == 5) // 5값이 있으면 종 눌럿!!
                flag = true;
        }

        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
