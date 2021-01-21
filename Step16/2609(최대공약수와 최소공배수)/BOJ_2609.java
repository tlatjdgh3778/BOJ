// 2609(최대공약수와 최소공배수)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_2609 {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(GCD(a, b));
        System.out.println(LCM(a, b));

    }

    // 최대공약수
    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

    // 최소공배수
    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
