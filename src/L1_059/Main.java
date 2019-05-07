package L1_059;

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
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(", ");
            String a = line[0];
            String b = line[1];
            int lena = a.length();
            int lenb = b.length();
            if (lena >= 3 && lenb >= 4) {
                String suba = a.substring(lena - 3, lena);
                String subb = b.substring(lenb - 4, lenb-1);
                if (suba.equals("ong") && subb.equals("ong")) {
                    // 原样输出上联
                    System.out.print(a + ", ");
                    String[] res = b.split(" ");
                    for (int j = 0; j < res.length-3; j++) {
                        System.out.print(res[j] + " ");
                    }
                    System.out.println("qiao ben zhong.");
                } else {
                    System.out.println("Skipped");
                }
            } else {
                System.out.println("Skipped");
            }
        }
    }
}
