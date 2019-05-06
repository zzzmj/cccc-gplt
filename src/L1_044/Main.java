package L1_044;

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
        int k = Integer.parseInt(br.readLine());
        int cnt = 1;
        while(true) {
            String s = br.readLine();
            if (s.equals("End")) break;
            
            if (cnt % (k+1) == 0) {
                System.out.println(s);
            } else {
                if (s.equals("ChuiZi")) {
                    System.out.println("Bu");
                } else if (s.equals("JianDao")) {
                    System.out.println("ChuiZi");
                } else if (s.equals("Bu")) {
                    System.out.println("JianDao");
                }
            }

            cnt++;
        }
    }
}
