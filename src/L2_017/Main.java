package L2_017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zmj
 * @create 2019/4/28
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[100005];
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(a, 0, n);
        int s1 = 0, s2 = 0;
        int t = n/2;
        int j = n - t;
        for (int i = 0; i < n; i++) {
            if (i < t) {
                s1 += a[i];
            } else {
                s2 += a[i];
            }
        }

        if (n%2 != 0 && t+1 < n) {
            int diff = (s2 - a[t+1]) - (s1 + a[t+1]);
            if (diff > s2 - s1) {
                s2 -= a[t+1];
                s1 += a[t+1];
                t++;
                j--;
            }
        }
        System.out.println("Outgoing #: " + j);
        System.out.println("Introverted #: " + t);
        System.out.println("Diff = " + (s2-s1));
    }
}
