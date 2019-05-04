package L1_023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        int g = 0, p = 0, l = 0, t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                g++;
            } else if (s.charAt(i) == 'p') {
                p++;
            } else if (s.charAt(i) == 'l') {
                l++;
            } else if (s.charAt(i) == 't') {
                t++;
            }
        }
        
        while (g > 0 || p > 0 || l > 0 || t > 0) {
            if (g > 0) {
                System.out.print("G");
                g--;
            }
            if (p > 0) {
                System.out.print("P");
                p--;
            }
            if (l > 0) {
                System.out.print("L");
                l--;
            }
            if (t > 0) {
                System.out.print("T");
                t--;
            }
        }
    }
}
