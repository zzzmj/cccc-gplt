package L1_017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zmj
 * @create 2019/5/3
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        double f = 1, o = 1;
        int len = s.length();
        if (s.charAt(0) == '-') {
            f = 1.5;
            len--;
        }
        if (Integer.parseInt(String.valueOf(s.charAt(s.length()-1))) % 2 == 0) {
            o = 2;
        }
        double sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') {
                sum++;
            }
        }
        System.out.println(String.format("%.2f%%", sum / len * f * o * 100));
    }
}
