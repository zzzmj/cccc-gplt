package L1_031;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/4
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            
            double bz = (height - 100) * 0.9 * 2;
            if (Math.abs(weight - bz) < bz*0.1) {
                System.out.println("You are wan mei!");
            } else {
                if (weight > bz) {
                    System.out.println("You are tai pang le!");
                } else {
                    System.out.println("You are tai shou le!");
                }
            }
        }
    }
}
