// 11051(이항 계수 2)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_11051 {
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        dp = new int[a + 1][b + 1];

        bw.write(String.valueOf(f(a, b)));
        bw.flush();

    }

    public static int f(int n, int m) {
        if (dp[n][m] > 0)
            return dp[n][m];
        if (m == 0 || n == m) {
            return 1;
        }
        dp[n][m] = (f(n - 1, m - 1) + f(n - 1, m)) % 10007;
        return dp[n][m];
    }
}