package L1_007;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/29
 */
public class Main {
    public static void main(String[] args) {
        String[] number = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                System.out.print("fu ");
            } else {
                int t = Integer.parseInt(String.valueOf(s.charAt(i)));
                System.out.print(number[t]);
                if (i != s.length()-1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
