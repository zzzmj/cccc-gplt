package L1_047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zmj
 * @create 2019/5/6
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            String name = line[0];
            int breath = Integer.parseInt(line[1]);
            int pulse = Integer.parseInt(line[2]);
            if (breath < 15 || breath > 20) {
                System.out.println(name);
            } else if (pulse < 50 || pulse > 70) {
                System.out.println(name);
            }
        }
    }
}
