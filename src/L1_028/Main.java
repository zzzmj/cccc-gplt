package L1_028;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            boolean flag = true;
            double sqr = Math.sqrt(t);
            
            if (t <= 1) {
                flag = false;
            }
            for (int j = 2; j <= sqr; j++) {
                if (t % j == 0) {
                    flag = false;
                }
            }
            
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
