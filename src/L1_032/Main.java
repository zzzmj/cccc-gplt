package L1_032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zmj
 * @create 2019/5/5
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        String ch = line[1];
        
        String s = br.readLine();
        int len = s.length();
        if (len < n) {
            for (int i = 0; i < n-len; i++) {
                System.out.print(ch);
            }
            System.out.println(s);
        } else if (len > n) {
            System.out.println(s.substring(len-n, len));
        } else {
            System.out.println(s);
        }
    }
}
