package L1_051;

import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/7
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double price = sc.nextDouble();
        int discount = sc.nextInt();

        System.out.println(String.format("%.2f", price*discount*0.1));
    }
}
