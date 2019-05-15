package L2_015;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author zmj
 * @create 2019/4/22
 */
public class Main {
    static InputReader in = new InputReader(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        
        double[] score = new double[n];
        
        for (int i = 0; i < n; i++) {
            int[] single = new int[k];
            for (int j = 0; j < k; j++) {
                single[j] = in.nextInt();
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
                out.print(" ");
            }
            out.print(String.format("%.3f", score[i]));
        }
        out.flush();
        out.close();
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while(tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return s;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }


        public long nextLong() {
            return Long.parseLong(next());
        }

        public Double nextDouble() {
            return Double.parseDouble(next());
        }
    }
    
}
