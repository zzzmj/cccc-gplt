package L1_012;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 2;
        }
        System.out.println("2^" + n + " = " + res);
    }
}
