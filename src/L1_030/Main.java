package L1_030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String[] boy = new String[105];
        String[] girl = new String[105];
        String[] line = new String[105];
        int p = 0, q = 0;
        for (int i = 0; i < n; i++) {
            line[i] = br.readLine();
        }
        
        int[] vis = new int[105];
        Arrays.fill(vis, 0);
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String[] s = line[i].split(" ");
            int sex = Integer.parseInt(s[0]);
            String name = s[1];
            System.out.print(name + " ");
            for (int j = n-1; j >= 0; j--) {
                String[] t = line[j].split(" ");
                int ts = Integer.parseInt(t[0]);
                String tn = t[1];
                if (vis[j] == 0 && sex != ts) {
                    vis[j] = 1;
                    System.out.print(tn);
                    break;
                }
            }
            cnt++;
            System.out.println();
            if (n/2 == cnt) break;
        }
    }
}
