package L1_022;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (t % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(odd + " " + even);
    }
}
