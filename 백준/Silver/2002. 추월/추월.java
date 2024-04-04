import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
    추월하는 기준이 입출력으로 보니 매우 간단한 문제이지 않을까 싶음
    그냥 차 들어오는 순서대로 번호를 매기고
    나가는 번호가 만약 들어오는 순서보다 작다면 추월로 인식
    그게 아니라면 추월이 아니라고 판단
     */
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());

            // 들어간 차
            Queue<String> inCar = new LinkedList<>();
            for(int i=0; i<N; i++) {
                inCar.add(br.readLine());
            }
            // 나온 차
            Queue<String> outCar = new LinkedList<>();
            for(int i=0; i<N; i++) {
                outCar.add(br.readLine());
            }

            int count = 0;
            while(!outCar.isEmpty()) {
                String outCarCheck = outCar.poll();
                if(!inCar.peek().equals(outCarCheck)) {
                    count++;
                    inCar.remove(outCarCheck);
                } else inCar.poll();
            }

            sb.append(count);
            System.out.println(sb);
        }
    }
