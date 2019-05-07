package L1_060;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/7
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int total = 100*100/2;
        
        double sa = 50*y;
        double sb = (100-x)*50;

        System.out.println((int)(total - sa - sb));
    }
}
