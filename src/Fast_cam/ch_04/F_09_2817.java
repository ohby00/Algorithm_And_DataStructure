package Fast_cam.ch_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class F_09_2817 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double D = 44687;
        double A = 68188;
        double C = 7008;
        double B = 48377;
        double G = 9664;

        double count = D + A + C + B + G;

        System.out.println(C / count * 100);
        System.out.println(C * 100 / count);

    }
}
