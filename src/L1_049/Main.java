package L1_049;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/6
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[105];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }
        
        int[][] res = new int[105][105];
        int[] school = new int[105];
        int cnt = 1;
        if (n == 1) cnt = 0;
        Arrays.fill(school, 0);
        for (int i = 0; i < 10*max; i++) {
            for (int j = 0; j < n; j++) {
                // 参赛选手要小于自己学校能派出的选手
                if (i < arr[j]*10) {
                    // 检查剩余学校
                    int num = 0;
                    for (int k = 0; k < n; k++) {
                        if (school[k] == 0) {
                            num++;
                        }
                    }
                    // 只剩下一个学校
                    if (num == 1) {
                        cnt += 1;
                        res[j][i] = cnt++;
                    } else {
                        res[j][i] = cnt++;
                    }
                } else {
                    // j号学校已经坐满
                    school[j] = 1;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("#" + (i+1));
            for (int j = 0; j < 10*arr[i]; j++) {
                if (j % 10 == 0 && j != 0) System.out.println();
                else if (j != 0) {
                    System.out.print(" ");
                }
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
