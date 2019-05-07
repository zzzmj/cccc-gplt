package L1_050;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/6
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        
        // 一共有多少个
        int total = (int)Math.pow(26, l);
        // 正数
        int num = total - n;
        for (int i = l-1; i >= 0; i--) {
            int mod = (int)Math.pow(26, i);
            int res = num / mod;
            System.out.print((char)(res + 'a'));
            num = num - mod*res;
        }
    }
}
