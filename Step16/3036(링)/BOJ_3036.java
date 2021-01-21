// 3036(링)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_3036 {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T - 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            System.out.println((N / GCD(N, arr[i])) + "/" + arr[i] / GCD(N, arr[i]));
        }

    }

    // 최대공약수
    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

}
