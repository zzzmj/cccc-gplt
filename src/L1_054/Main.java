package L1_054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zmj
 * @create 2019/5/7
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        
        String s = line[0];
        int n = Integer.parseInt(line[1]);
        String[] res = new String[105];
        for (int i = 0; i < n; i++) {
            res[i] = br.readLine();
        }
        
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i].charAt(j) != res[n-i-1].charAt(n-j-1)) {
                    flag= false;
                    break;
                }
            }
        }
        
        if (flag) {
            System.out.println("bu yong dao le");
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (res[i].charAt(j) != ' ') {
                    System.out.print(s);
                } else {
                    System.out.print(" ");                    
                }
            }
            System.out.println();
        }
    }
}
