package L1_006;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sqr = Math.sqrt(n);
        int max = 0;
        int sign = 0;
        for (int i = 2; i <= sqr; i++) {
            int s = n;
            int j = i;
            int len = 0;
            while (s % j == 0) {
                s /= j;
                len++;
                j++;
            }
            if (len > max) {
                max = len; // 标记长度
                sign = j-1; // 标记尾数
            }
        }
        
        if (max == 0) {
            System.out.println("1\n" + n);
        } else {
            System.out.println(max);
            for (int i = sign-max+1; i <= sign; i++) {
                System.out.print(i);
                if (i != sign) {
                    System.out.print("*");
                }
            }
        }
    }
}
