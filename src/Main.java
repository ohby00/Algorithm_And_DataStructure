import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution();
    }
    public static void solution() {

          int i = 0;
        int[] arr = {1, 4, 2, 5, 3};
        Stack<Integer> stack = new Stack<>();

        while(i < arr.length){
            for(int a : arr){
                if(!stack.isEmpty()){
                    if(stack.peek() < a){
                        stack.push(a);
                        i++;
                    }else if(stack.peek() >= a){
                        stack.pop();
                        stack.push(a);
                    }
                }else{
                    stack.push(a);
                    i++;
                }
            }
        }
    }


}




