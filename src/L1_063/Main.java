package L1_063;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/7
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sex = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            if (sex == 1) {
                if (height == 130) {
                    System.out.print("wan mei! ");
                } else if (height < 130) {
                    System.out.print("duo chi yu! ");
                } else {
                    System.out.print("ni li hai! ");
                }
                
                if (weight == 27) {
                    System.out.print("wan mei!");
                } else if (weight < 27) {
                    System.out.print("duo chi rou!");
                } else {
                    System.out.print("shao chi rou!");
                }
            } else {
                if (height == 129) {
                    System.out.print("wan mei! ");
                } else if (height < 129) {
                    System.out.print("duo chi yu! ");
                } else {
                    System.out.print("ni li hai! ");
                }

                if (weight == 25) {
                    System.out.print("wan mei!");
                } else if (weight < 25) {
                    System.out.print("duo chi rou!");
                } else {
                    System.out.print("shao chi rou!");
                }
            }
            System.out.println();
        }
    }
}
