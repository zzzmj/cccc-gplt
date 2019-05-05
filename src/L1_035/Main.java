package L1_035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zmj
 * @create 2019/5/5
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        
        String a = "", b = "";
        while (true) {
            String s = br.readLine();
            if (s.equals(".")) break;
            cnt++;
            if (cnt == 2) {
                a = s;
            }
            if (cnt == 14) {
                b = s;
            }
        }
        
        if (a.isEmpty()) {
            System.out.println("Momo... No one is for you ...");
        } else if (b.isEmpty()) {
            System.out.println(a + " is the only one for you...");
        } else {
            System.out.println(a +  " and " + b +" are inviting you to dinner...");
        }
    }
}
