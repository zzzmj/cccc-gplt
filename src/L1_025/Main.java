package L1_025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        String a = "", b = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                a = s.substring(0, i);
                b = s.substring(i+1, s.length());
                break;
            }
        }
        
        // 检查a, b是否是正整数
        boolean flagA = true, flagB = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < '0' || a.charAt(i) > '9') {
                flagA = false;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) < '0' || b.charAt(i) > '9') {
                flagB = false;
            }
        }
        
        if (flagA) {
            int t = Integer.parseInt(a);
            if (t > 1000 || t < 1) flagA = false;
        }
        if (flagB) {
            int t = Integer.parseInt(b);
            if (t > 1000 || t < 1) flagB = false;
        }
        
        if (flagA && flagB) {
            int res = Integer.parseInt(a) + Integer.parseInt(b);
            System.out.println(a + " + " + b + " = " + res);
        } else if (flagA && !flagB) {
            System.out.println(a + " + ? = ?");
        } else if (!flagA && flagB) {
            System.out.println("? + " + b +  " = ?");
        } else {
            System.out.println("? + ? = ?");
        }
    }
}
