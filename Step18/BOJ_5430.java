// 5430(AC)

package Step18;

import java.util.*;
import java.io.*;

public class BOJ_5430 {
    public static StringTokenizer st;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        // int r_cnt = 0;
        // int d_cnt = 0;

        for (int i = 0; i < T; i++) {
            Deque<Integer> arr = new ArrayDeque<>();
            ArrayList<Character> f = new ArrayList<>();

            String str = br.readLine(); // 함수 RDD
            for (int j = 0; j < str.length(); j++) {
                f.add(str.charAt(j));
            }
            n = Integer.parseInt(br.readLine()); // 4
            // [1,2,3,4] 가 들어오면 1 2 3 4 로 얻어야 함... 어떻게
            // int idx = 1;

            String arr_str = br.readLine();
            // [, ] 를 빼야함
            arr_str = arr_str.substring(1, arr_str.length() - 1);
            st = new StringTokenizer(arr_str, ",");
            for (int j = 0; j < n; j++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            // -------------------------------

            boolean flag = false;
            boolean r = true;

            for (int j = 0; j < f.size(); j++) {
                if (f.get(j) == 'R') {
                    r = !r;
                } else {
                    // D 이면
                    // 없으면 ? 에러 출력
                    if (arr.isEmpty()) {
                        flag = true;
                        break;
                    }
                    // 정방향
                    if (r) {
                        arr.pollFirst();
                    } // 역방향
                    else {
                        arr.pollLast();
                    }
                }
            }

            if (flag == true) {
                sb.append("error\n");
            } else {
                sb.append("[");
                if (r == true) {
                    while (arr.size() > 1) {
                        sb.append(arr.pollFirst() + ",");
                    }
                } else {
                    while (arr.size() > 1)
                        sb.append(arr.pollLast() + ",");
                }
                if (arr.size() != 0)
                    sb.append(arr.getFirst());
                sb.append("]\n");
            }
        }
        System.out.println(sb);
    }
}