package Setp_p.Step_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        br.close();

        System.out.println(str1.length());
    }
}