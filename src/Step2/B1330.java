package Step2;



import java.util.Scanner;
public class B1330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
    }

}