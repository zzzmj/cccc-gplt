package L1_015;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        String c = sc.next();
        
        int row = (int) Math.round(n/2);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
