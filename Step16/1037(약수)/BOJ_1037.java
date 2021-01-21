// 1037(약수)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            int T = Integer.parseInt(st.nextToken());
            if (T > max)
                max = T;
            if (T < min)
                min = T;
        }
        System.out.println(max * min);
    }
}
