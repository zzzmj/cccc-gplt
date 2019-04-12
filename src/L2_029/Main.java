package L2_029;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/11
 */
public class Main {
    static int f(int n) {
        int sum = 0;
        while (n != 0) {
            int t = n % 10;
            sum += t*t;
            n /= 10;
        }
        return sum;
    }
    
    static boolean prime(int n) {
        if (n <= 1) return false;
        double sqr = Math.sqrt(n);
        for (int i = 2; i <= sqr; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[30];
        HashSet<Integer> set = new HashSet<Integer>();
        int[] vis = new int[10005];
        for (int i = a; i <= b; i++) {
            int t = i;
            int cnt = 0;
            while(cnt <= 20 && t != 1) {
                arr[cnt] = t;
                int v = f(t);
                t = v;
                cnt++;
            }
            if (t == 1) {
                vis[arr[0]] = cnt;
                if (prime(arr[0])) vis[arr[0]] *= 2;
                for (int j = 0; j < cnt; j++) {
                    if (set.contains(arr[j])) {
                        vis[arr[j]] = -1;
                    } else {
                        set.add(arr[j]);
                    }
                }
            }
        }
        boolean flag = true;
        for (int i = a; i <= b; i++) {
            if (set.contains(i) && vis[i] != -1) {
                flag = false;
                System.out.println(i + " " + vis[i]);
            }
        }
        if (flag) System.out.println("SAD");
    }
}
