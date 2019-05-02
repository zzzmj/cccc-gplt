package L1_008;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
            System.out.print(String.format("%5d", i));
            cnt++;
            if (cnt % 5 == 0 || i == b) {
                System.out.println();
            }
        }
        System.out.println("Sum = " + sum);
    }
}
