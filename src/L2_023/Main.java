package L2_023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author zmj
 * @create 2019/4/12
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int v = Integer.parseInt(line[0]);
        int e = Integer.parseInt(line[1]);
        int k = Integer.parseInt(line[2]);
        
        int[][] G = new int[v+5][v+5];
        int[] vis = new int[v + 5];

        for (int i = 0; i < v+5; i++)
            Arrays.fill(G[i], 0);
        
        for (int i = 0; i < e; i++) {
            String[] l = br.readLine().split(" ");
            int a = Integer.parseInt(l[0]);
            int b = Integer.parseInt(l[1]);
            G[a][b] = 1;
            G[b][a] = 1;
        }
        
        
        int n = Integer.parseInt(br.readLine());
        while(n != 0) {
            HashSet<Integer> set = new HashSet<Integer>();
            Arrays.fill(vis, 0);
            String[] colors = br.readLine().split(" ");
            for (int i = 1; i <= v; i++) {
                vis[i] = Integer.parseInt(colors[i-1]);
                set.add(vis[i]);
            }
            int cnt = set.size();
            if (cnt != k) {
                System.out.println("No");
            } else {
                boolean flag = true;
                for (int i = 1; i <= v; i++) {
                    for (int j = 1; j <= v; j++) {
                        // i顶点与其他相邻顶点颜色相同则标记为false
                        if (G[i][j] == 1 && vis[i] == vis[j]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            n--;
        }
    }
}
