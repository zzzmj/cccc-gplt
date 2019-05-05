package L1_033;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/5
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int n = sc.nextInt();
        
        int num = y;
        while(true) {
            // 填充0
            String s = String.format("%04d", num);
            HashSet<Character> hs = new HashSet<Character>();
            for (int i = 0; i < s.length(); i++) {
                hs.add(s.charAt(i));
            }
            if (hs.size() == n) {
                break;
            }
            num++;
        }
        System.out.println(num-y + " " + String.format("%04d", num));
    }
}
