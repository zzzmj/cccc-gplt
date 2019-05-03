package L1_013;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int s = 1;
            for (int j = i; j > 0; j--) {
                s *= j;
            }
            res += s;
        }
        System.out.println(res);
    }
}
