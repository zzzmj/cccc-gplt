package L2_032;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author zmj
 * @create 2019/4/15
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        while(k != 0) {
            int[] a = new int[1005];
            Stack<Integer> s = new Stack<Integer>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int cnt = 1;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != cnt) {
                    s.push(a[i]);
                    if (s.size() > m) {
                        flag = false;
                        break;
                    }
                } else {
                    cnt++;
                }
                // 检查货架上是否有
                while(!s.empty() && s.peek() == cnt) {
                    cnt++;
                    s.pop();
                }
            }
            if (flag && cnt == n+1) {
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            k--;
        }
    }
}
