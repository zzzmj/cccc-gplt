package L1_048;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/6
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[105][105];
        int[][] b = new int[105][105];
        int ra = sc.nextInt();
        int ca = sc.nextInt();
        for (int i = 0; i < ra; i++) {
            for (int j = 0; j < ca; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int rb = sc.nextInt();
        int cb = sc.nextInt();
        for (int i = 0; i < rb; i++) {
            for (int j = 0; j < cb; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        if (ca != rb) {
            System.out.println(String.format("Error: %d != %d", ca, rb));
        } else {
            System.out.println(ra + " " + cb);
            for (int i = 0; i < ra; i++) {
                for (int k = 0; k < cb; k++) {
                    int sum = 0;
                    for (int j = 0; j < ca; j++) {
                        sum += a[i][j] * b[j][k];
                    }
                    if (k != 0) {
                        System.out.print(" ");
                    }
                    System.out.print(sum);
                }
                System.out.println();
            }
        }
    }
}
