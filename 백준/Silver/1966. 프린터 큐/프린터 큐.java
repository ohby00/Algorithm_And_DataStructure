import java.io.*;
import java.util.*;

public class Main {

    static LinkedList<int[]> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); 

        while(T --> 0){ 
            queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //문서의 개수
            int M = Integer.parseInt(st.nextToken()); //몇번째로 인쇄되는지 알고 싶은 문서의 순서 번호
            st = new StringTokenizer(br.readLine());
            
            for(int i = 0; i < N; i++){ 
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())}); //각각의 초기 위치, 중요도를 입력한다.
            }
            sb.append(solution(M)).append("\n");
        }
        System.out.println(sb);
    }

    static int solution(int M){
        int findIt = 0; // M이 순서 기록 

        while(!queue.isEmpty()){ 
            int[] first = queue.poll();
            boolean isMax = true;
            
            for(int i = 0; i < queue.size(); i++){
                //지금 뽑은 요소보다 큰 요소다 있을 경우
                if(first[1] < queue.get(i)[1]){
                    queue.offer(first); //뽑은 해당 요소를 맨 뒤에 넣고
                    //반복하면서 마주한 뽑은 요소(first)보다 안 큰 요소들 또한 맨뒤에 넣는다.
                    for(int j = 0; j < i; j++){
                        //queue의 i번째에 first(뽑은 요소)보다 큰 게 있는 것이므로
                        // i까지만 반복한다.
                        queue.offer(queue.poll());
                    }
                    isMax = false; // 해당 뽑은 요소(first)보다 큰 요소가 있다는 뜻이므로 first를 한다.
                    break; // 걸러졌으므로 반복문을 나온다.
                }
            }
            if(isMax == false) //뽑은 요소보다 큰 요소가 있어서 걸러졌다면 다시 반복문을 돌아야한다.(밑은 수행X)
                continue;

            //first가 가장 큰 요소인 거니까
            findIt++; //1씩 증가한다.(큰 요소를 하나씩 누적 개수 더하기 해서)

            if(first[0] == M) //찾는 요소일 경우 반복문을 빠져나가서
                break;
        }

        return findIt; //큰 요소를 누적 개서 더하기 한거를 반환
    }
}