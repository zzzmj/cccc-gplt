package L1_027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int[] num = new int[15];
        Arrays.fill(num, 0);
        for (int i = 0; i < s.length(); i++) {
            int t = Integer.parseInt(String.valueOf(s.charAt(i)));
            num[t] = 1;
        }
        
        int[] arr = new int[15];
        int cnt = 0;
        for (int i = 9; i >= 0; i--) {
            if (num[i] == 1) {
                arr[cnt++] = i;
            }
        }
        int[] index = new int[15];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            int t = Integer.parseInt(String.valueOf(s.charAt(i)));
            
            // 找到t在num数组中的位置
            for (int j = 0; j < cnt; j++) {
                if (t == arr[j]) {
                    index[k++] = j;
                    break;
                }
            }
        }
        
        System.out.print("int[] arr = new int[]{");
        for (int i = 0; i < cnt; i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(arr[i]);
        }
        System.out.println("};");


        System.out.print("int[] index = new int[]{");
        for (int i = 0; i < k; i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(index[i]);
        }
        System.out.println("};");
    }
}
