package L2_015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zmj
 * @create 2019/4/22
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int m = Integer.parseInt(line[2]);
        
        double[] score = new double[n];
        
        for (int i = 0; i < n; i++) {
            int[] single = new int[k];
            String[] t = br.readLine().split(" ");
            for (int j = 0; j < k; j++) {
                single[j] = Integer.parseInt(t[j]);
            }
            Arrays.sort(single);
            
            double sum = 0;
            for (int j = 1; j < k-1; j++) {
                sum += single[j];
            }
            score[i] = sum / (k-2);
        }
        
        Arrays.sort(score);
        
        for (int i = n-m; i < n; i++) {
            if (i > n - m) {
                System.out.print(" ");
            }
            System.out.print(String.format("%.3f", score[i]));
        }
    }
}
