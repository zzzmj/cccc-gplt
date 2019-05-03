package L1_016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author zmj
 * @create 2019/5/2
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        String[] check = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int res = 0;
            boolean flag = true;
            for (int j = 0; j < 17; j++) {
                if (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                    int t = Integer.parseInt(String.valueOf(s.charAt(j)));
                    res += t * weight[j];
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                String v = String.valueOf(s.charAt(17));
                if (!check[res % 11].equals(v)) {
                    list.add(s);
                }
            } else {
                list.add(s);
            }
        }
        
        if (list.size() == 0) {
            System.out.println("All passed");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
