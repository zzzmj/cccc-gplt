package L1_037;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/5
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > 0) {
            System.out.println(a + "/" + b + "=" + String.format("%.2f", a*1.0/b));
        } else if (b < 0) {
            System.out.println(a + "/(" + b + ")=" + String.format("%.2f", a*1.0/b));
        } else {
            System.out.println(a + "/" + b + "=Error");
        }
    }
}
