package L1_019;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/3
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = sc.nextInt();
        int sumb = sc.nextInt();
        int n = sc.nextInt();
        
        int p = 0, q = 0;
        boolean flag = true;
        
        for (int i = 0; i < n; i++) {
            // 甲喊 甲划 乙喊 乙划
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            int res = a + c;
            // 甲输
            if (b == res && d != res) {
                p++;
            } else if (d == res && b != res) {
                q++;
            }
            
            if (p > suma) {
                System.out.println("A\n" + q);
                break;
            } else if (q > sumb) {
                System.out.println("B\n" + p);
                break;
            }
        }
    }
}
