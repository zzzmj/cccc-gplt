package L1_034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zmj
 * @create 2019/5/5
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[1005];
        Arrays.fill(a, 0);
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int k = Integer.parseInt(line[0]);
            for (int j = 1; j <= k; j++) {
                int f = Integer.parseInt(line[j]);
                a[f]++;
            }
        }
        
        int max = 0;
        int res = 0;
        for (int i = 1000; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                res = i;
            }
        }
        System.out.println(res + " " + max);
    }
}
