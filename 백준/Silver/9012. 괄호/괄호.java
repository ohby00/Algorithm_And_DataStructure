import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();
            System.out.println(check(str) ? "YES" : "NO");
        }
    }

    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if(ch == '(')
                stack.push(ch);
            else {
                if(stack.isEmpty())
                    return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
