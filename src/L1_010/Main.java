package L1_010;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/4/29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, 0, 3);
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
            if (i != 2) {
                System.out.print("->");
            }
        }
        System.out.println();
    }
}
