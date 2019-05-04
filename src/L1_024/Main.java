package L1_024;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int res = (d+2) % 7;
        if (res == 0) {
            res = 7;
        }
        System.out.println(res);
    }
}
