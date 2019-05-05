package L1_039;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/5
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 同样的原因，当然java可以改，但是我懒得改了。。
        String s = sc.nextLine();
        int len = s.length();
        int y = (len-1) / n;
        for (int i = 0; i < n; i++) {
            for (int j = n * y + i; j >= i; j -= n) {
                if (j >= len) {
                    System.out.print(" ");
                } else {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
