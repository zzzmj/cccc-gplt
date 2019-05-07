package L1_056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zmj
 * @create 2019/5/7
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String[] name = new String[105];
        Arrays.fill(name, "");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int pos = Integer.parseInt(line[1]);
            name[pos] = line[0];
            sum += pos;
        }
        
        sum = sum / (2*n);
        
        double min = Double.MAX_VALUE;
        String res = "";
        for (int i = 0; i < 105; i++) {
            if (!name[i].isEmpty()) {
                double t = Math.abs(i - sum);
                if (t < min) {
                    res = name[i];
                    min = t;
                }
            }
        }
        System.out.println((int)sum + " " + res);
    }
}
