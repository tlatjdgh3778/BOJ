// 9375(패션왕 신해빈)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_9375 {
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            // 의상 수 N
            N = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<String, Integer>();
            // 모자 2 셔츠 2 신발 3
            // 모자 쓰지 않는, 첫 번째 모자, 두 번째 모자
            // = n+1 개.
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                // String str1 = st.nextToken(); // hat
                String str2 = st.nextToken(); // headgear
                if (map.containsKey(str2)) {
                    // headgear의 value값을 idx에 저장
                    int idx = map.get(str2);
                    map.put(str2, idx + 1);
                } else {
                    map.put(str2, 1);
                }
            }
            int result = 1;
            for (int val : map.values()) {
                // 각 의상+1 을 곱하고 마지막에 -1(알몸인 경우)
                result = result * (val + 1);
            }
            System.out.println(result - 1);
        }
    }
}
