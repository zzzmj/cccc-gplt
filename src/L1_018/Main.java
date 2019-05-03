package L1_018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zmj
 * @create 2019/5/3
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(":");
        int h = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        if (h < 12 || (h == 12 && m == 0)) {
            System.out.println("Only " + line[0] + ":" + line[1] + ".  Too early to Dang.");
        } else {
            for (int i = 0; i < h - 12; i++) {
                System.out.print("Dang");
            }
            if (m > 0) {
                System.out.print("Dang");
            }
            System.out.println();
        }
    }
}
