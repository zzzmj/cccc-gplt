package L2_014;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/15
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100005];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            // 第一次和列车队列最小值小于当前值，则需要重开 
            if (i == 0 || a[cnt-1] < t) {
                a[cnt++] = t;
            } else {
                // 二分查找最小值 
                int lo = 0, hi = cnt;
                while(lo < hi) {
                    int mid = (lo + hi) / 2;
                    if (a[mid] < t) lo = mid + 1;
                    else hi = mid;
                }
                a[lo] = t;
            }
        }
        System.out.println(cnt);
    }
}
