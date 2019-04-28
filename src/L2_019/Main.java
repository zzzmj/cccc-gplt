package L2_019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author zmj
 * @create 2019/4/28
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> hs = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        
        for (int i = 1; i <= n; i++) {
            hs.add(line[i]);
        }
        int m = Integer.parseInt(br.readLine());
        double sum = 0;
        TreeMap<String, Integer> mp = new TreeMap<String, Integer>();
        for (int i = 0; i < m; i++) {
            String[] info = br.readLine().split(" ");
            String t = info[0];
            int like = Integer.parseInt(info[1]);
            mp.put(t, like);
            sum += like;
        }
        boolean flag = true;
        double avg = sum / m;
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            int like = entry.getValue();
            String key = entry.getKey();
            if (like > avg && !hs.contains(key)) {
                System.out.println(key);
                flag = false;
            }
        }

        if (flag) {
            System.out.println("Bing Mei You");
        }
    }
}
