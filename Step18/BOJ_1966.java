// 1966(프린터 큐)

package Step18;

import java.util.*;
import java.io.*;

public class BOJ_1966 {
    public static int n, m;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); // TestCase

        for (int a = 0; a < T; a++) {
            LinkedList<Integer> pri = new LinkedList<>(); // 중요도 큐
            Queue<Integer> idx = new LinkedList<>(); // 인덱스 큐

            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                // 중요도 큐에 저장
                int o = Integer.parseInt(st.nextToken());
                pri.offer(o);
                // 인덱스 번호 저장
                idx.offer(i);
            }
            int cnt = 0;
            boolean isMax;
            // 중요도 확인
            while (!pri.isEmpty()) {
                int max = pri.peek();
                isMax = true;
                for (int i = 0; i < pri.size(); i++) {
                    if (max < pri.get(i)) {
                        int tmp = pri.poll();
                        pri.offer(tmp);
                        int tmp2 = idx.poll();
                        idx.offer(tmp2);

                        isMax = false;
                        break;
                    }
                }
                if (isMax) {
                    cnt++;
                    pri.poll();
                    int chk = idx.poll();
                    if (chk == m) {
                        System.out.println(cnt);
                        break;
                    }
                }
            }
        }
    }
}