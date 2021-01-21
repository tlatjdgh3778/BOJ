// 2981(검문)

package Step16;

import java.io.*;

public class BOJ_2981 {
    public static int[] arr;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // arr[0]-arr[1], arr[1]-arr[2],,,arr[n-1]-arr[n]
        res = Math.abs(arr[0] - arr[1]);

        for (int i = 0; i < T - 1; i++) {

            res = GCD(res, Math.abs(arr[i] - arr[i + 1]));
        }
        for (int i = 2; i <= res; i++) {
            if (res % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 최대공약수
    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }
}