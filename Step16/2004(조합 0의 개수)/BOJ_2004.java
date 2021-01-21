// 2004(조합 0의 개수)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        // 팩토리얼을 이루는 수에서 5가 몇개인지 구함
        // 근데 25(5*5),,50(2*5*5),, 25배수는 5가 두 번
        // 처음 N/i = 100/5 5의 개수를 구하고
        // 그 다음 N/i = 100/25 25 배수 개수 구해서 합.

        /*
         * for(long i=5; i<=C; i=i*5){ cnt5 = cnt5 + C/i; } for(long i=2; i<=C; i=i*2){
         * cnt2 = cnt2 + C/i; }
         */

        System.out.println(Math.min(cnt2(n) - (cnt2(m) + cnt2(n - m)), cnt5(n) - (cnt5(m) + cnt5(n - m))));
    }

    public static long cnt2(long N) {
        long cnt2 = 0;

        for (long i = 2; i <= N; i = i * 2) {
            cnt2 = cnt2 + N / i;
        }
        return cnt2;
    }

    public static long cnt5(long N) {
        long cnt5 = 0;

        for (long i = 5; i <= N; i = i * 5) {
            cnt5 = cnt5 + N / i;
        }
        return cnt5;
    }
}
