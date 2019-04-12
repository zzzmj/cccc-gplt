package L1_002;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/10
 */
public class Main {
    static int MAXN = 25;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[MAXN];
        int n = sc.nextInt();
        String s = sc.next();
        
        for (int i = 1; i < MAXN; i++) {
            a[i] = 2*i*i - 1;
        }
        int pos = -1;
        for (int i = 1; i <= n; i++) {
            if (a[i] <= n) {
                pos = i;
            } else {
                break;
            }
        }
        for (int i = pos; i >= 1; i--) {
            for (int j = 0; j < pos-i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print(s);
            }
            System.out.println();
        }
        for (int i = 2; i <= pos; i++) {
            for (int j = 0; j < pos-i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print(s);
            }
            System.out.println();
        }
        System.out.println(n - a[pos]);
    }
}
