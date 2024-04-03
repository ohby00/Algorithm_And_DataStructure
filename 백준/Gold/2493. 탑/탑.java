import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Top {
    int num;
    int height;

    Top(int num, int height) {
        this.num = num;
        this.height = height;
    }
}
public class Main {
    /*
            스택으로 가져 오면서 왼쪽에 레이저를 쏴야 하니까 가져올 때 마다 체크
            a > b 일때, b의 높이가 더 큰거라 레이저를 쏴도 못받으니까 0 출력
             a <= b 일때, 레이저를 사용해도 되니까 바로 출력 해줌
             a <- b <- c 왼쪽 방향으로만 레이저 발사
     */

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Stack<Top> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int height = Integer.parseInt(st.nextToken());

            if (stack.isEmpty()) {  // 첫 값에 대한 초기설정
                sb.append("0 "); // 어차피 왼쪽에는 레이저를 받을 수 없음 0 출력
                stack.push(new Top(i, height)); // 새로운 Top 받아서 푸쉬
            } else {
                while (true) { // 스택안에 데이터가 있으면...
                    if (stack.isEmpty()) { // 만약 없다면
                        sb.append("0 "); // -> 0을 출력
                        stack.push(new Top(i, height)); // , 탑을 push
                        break;
                    }
                    Top top = stack.peek(); // top 객체로 가져옴
                    if (top.height > height) { // peek한 탑의 높이 > 기존 탑 높이
                        sb.append(top.num + " "); // peek한 탑의 번호를 출력
                        stack.push(new Top(i, height)); // 현재 탑을 스택에 push한다.
                        break;
                    } else { // peek한 탑의 높이가 현재 탑의 높이보다 낮다면,
                        stack.pop(); // 스택에서 pop하고 다시 반복문을 돌린다.
                    }
                }
            }
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}