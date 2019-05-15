package L2_014;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author zmj
 * @create 2019/4/15
 */
public class Main {
    static InputReader in = new InputReader(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[100005];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            // 第一次和列车队列最小值小于当前值，则需要重开 
            if (i == 0 || a[cnt-1] < t) {
                a[cnt++] = t;
            } else {
                // 二分查找最小值 
                int lo = 0, hi = cnt;
                while(lo < hi) {
                    int mid = (lo + hi) / 2;
                    if (a[mid] < t) lo = mid + 1;
                    else hi = mid;
                }
                a[lo] = t;
            }
        }
        System.out.println(cnt);
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
