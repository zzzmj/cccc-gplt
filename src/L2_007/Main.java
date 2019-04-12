package L2_007;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/11
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (s.charAt(i + j) == s.charAt(i - j)) {
                    
                }
            }
        }
        System.out.println(s);
    }
}
