package L1_043;

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
        int[] book = new int[1005];
        boolean[] flag = new boolean[1005];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int cnt = 0;
            Arrays.fill(book, 0);
            Arrays.fill(flag, false);
            while(true) {
                String[] line = br.readLine().split(" ");
                int num = Integer.parseInt(line[0]);
                if (num == 0) break;
                String key = line[1];
                String[] time = line[2].split(":");
                int h = Integer.parseInt(time[0]);
                int m = Integer.parseInt(time[1]);
                
                if (key.equals("S")) {
                    book[num] = h*60 + m;
                    flag[num] = true;
                } else if (key.equals("E")) {
                    // 书之前必须被借过
                    if (flag[num]) {
                        // 变为不可借
                        flag[num] = false;
                        cnt++;
                        sum += (h*60 + m - book[num]);
                    }
                }
            }
            if (cnt == 0) {
                System.out.println("0 0");
            } else {
                System.out.println(cnt + " " + (int)(sum*1.0/cnt + 0.5));
            }
        }
    }
}
