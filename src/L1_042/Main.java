package L1_042;

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
        String[] s = br.readLine().split("-");
        System.out.println(s[2] + "-" + s[0] + "-" + s[1]);
    }
}
