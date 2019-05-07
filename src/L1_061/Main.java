package L1_061;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/7
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        
        double res = weight / (height*height);
        
        if (res > 25) {
            System.out.println(String.format("%.1f\nPANG", res));
        } else {
            System.out.println(String.format("%.1f\nHai Xing", res));
        }
    }
}
