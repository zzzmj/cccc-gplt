package L1_011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zmj
 * @create 2019/4/29
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int[] s = new int[1005];
        Arrays.fill(s, 0);
        for (int i = 0; i < b.length(); i++) {
            s[b.charAt(i)] = 1;
        }
        for (int i = 0; i < a.length(); i++) {
            char t = a.charAt(i);
            if (s[t] == 0) {
                System.out.print(t);
            }
        }
    }
}
