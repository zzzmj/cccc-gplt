package L1_005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author zmj
 * @create 2019/4/29
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> mp = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            String number = line[0] + " " + line[2];
            String a = line[1];
            mp.put(a, number);
        }
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> pr = new ArrayList<String>();
        String[] find = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            pr.add(mp.get(find[i]));
        }
        for (int i = 0; i < m; i++) {
            System.out.println(pr.get(i));
        }
    }
}
