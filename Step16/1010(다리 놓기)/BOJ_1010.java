// 1010(다리 놓기)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // TestCase

        StringTokenizer st;

        for (int k = 0; k < T; k++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // 서쪽 사이트
            int M = Integer.parseInt(st.nextToken()); // 동쪽 사이트

            int[][] dp = new int[N + 1][M + 1];
            // dp배열 = 서쪽 사이트 N, 동쪽 사이트 M일 때 나올 수 있는 경우의 수
            // 점화식
            // dp[a][b] = dp[a][b-1] + dp[a-1][b-1]
            for (int i = 1; i <= M; i++) {
                // 서쪽 사이트가 1이면 경우의 수는 동쪽 사이트 수.
                dp[1][i] = i;
            }
            for (int i = 2; i <= N; i++) {
                for (int j = 2; j <= M; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                }
            }
            System.out.println(dp[N][M]);
        }
    }
}
