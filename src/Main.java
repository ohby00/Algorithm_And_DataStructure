import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();

        int count = 0;
        int starIndex = 0;

        while (true){
            int findIndex = doc.indexOf(word,starIndex);
            if( findIndex < 0)
                break;
            count++;
            starIndex = findIndex + word.length();
        }
        System.out.println(count);
    }
}