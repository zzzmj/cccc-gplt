package L1_055;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/7
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pa = sc.nextInt();
        int pb = sc.nextInt();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (pa > pb) {
            if (a == 0 || b == 0 || c == 0) {
                int sum = 0;
                if (a == 0) sum++;
                if (b == 0) sum++;
                if (c == 0) sum++;
                System.out.println(String.format("The winner is a: %d + %d", pa, sum));
            } else if (a == 1 && b == 1 && c == 1) {
                System.out.println(String.format("The winner is b: %d + 3", pb));
            }
        } else {
            if (a == 1 || b == 1 || c == 1) {
                int sum = 0;
                if (a == 1) sum++;
                if (b == 1) sum++;
                if (c == 1) sum++;
                System.out.println(String.format("The winner is b: %d + %d", pb, sum));
            } else if (a == 0 && b == 0 && c == 0) {
                System.out.println(String.format("The winner is a: %d + 3", pa));
            }
        }
    }
}
