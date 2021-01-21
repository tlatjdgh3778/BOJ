// 1676(팩토리얼 0의 개수)

package Step16;

import java.io.*;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 팩토리얼을 이루는 수에서 5가 몇개인지 구함
        // 근데 25(5*5),,50(2*5*5),, 25배수는 5가 두 번
        // 처음 N/i = 100/5 5의 개수를 구하고
        // 그 다음 N/i = 100/25 25 배수 개수 구해서 합.
        for (int i = 5; i <= N; i = i * 5) {
            cnt = cnt + N / i;
        }
        System.out.println(cnt);
    }
}