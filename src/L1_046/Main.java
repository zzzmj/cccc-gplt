package L1_046;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author zmj
 * @create 2019/5/6
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        BigInteger n = new BigInteger(String.valueOf(x));
        BigInteger gg = new BigInteger("0");
        BigInteger shi = new BigInteger("10");
        BigInteger yi = new BigInteger("1");
        
        int cnt = 0;
        while(true) {
            gg = gg.multiply(shi).add(yi);
            cnt++;
            if (gg.mod(n).intValue() == 0) {
                System.out.println(gg.divide(n) + " " + cnt);
                break;
            }
        }
    }
}
