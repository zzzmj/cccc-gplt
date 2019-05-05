package L1_041;

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
        
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            int t = Integer.parseInt(arr[i]);
            if (t == 250) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
