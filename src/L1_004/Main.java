package L1_004;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/10
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F = sc.nextDouble();
        double C = 5 * (F - 32) / 9;
        System.out.println("Celsius = " + (int)C);
    }
}
