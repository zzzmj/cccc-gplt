package L1_003;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/10
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        for (int i = 0; i <= 9; i++) {
            char ch = (char) (i + '0');
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    cnt++;
                }
            }
            if (cnt > 0) {
                System.out.println(ch + ":" + cnt);
            }
        }
    }
}
