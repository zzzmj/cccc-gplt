package L1_029;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        System.out.println(String.format("%.1f", (h-100) * 0.9 * 2));
    }
}
