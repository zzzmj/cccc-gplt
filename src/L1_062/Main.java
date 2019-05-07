package L1_062;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/7
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            
            int a = 0, b = 0;
            for (int j = 0; j < 6; j++) {
                if (j < 3) a += Integer.parseInt(String.valueOf(s.charAt(j)));
                else if (j < 6) b += Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            if (a == b) {
                System.out.println("You are lucky!");
            } else {
                System.out.println("Wish you good luck.");
            }
        }
    }
}
