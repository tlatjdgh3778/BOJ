// 1021(회전하는 큐)

package Step18;

import java.util.*;
import java.io.*;

public class BOJ_1021 {
    public static int target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int half = 0;

        LinkedList<Integer> dq = new LinkedList<Integer>();

        for (int i = 0; i < N; i++) {
            dq.add(i + 1);
        }
        // index는 0부터 시작

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            // M // 2,9,5 를 찾아보자
            target = Integer.parseInt(st.nextToken()); // 2, 9, 5
            // 왼쪽, 오른쪽 어디가 더 가까울까??

            // 중간값 정하기
            if (dq.size() % 2 == 0) {
                // 짝수면
                half = (dq.size() / 2) - 1;
            } else {
                // 홀수면
                half = dq.size() / 2;
            }
            int idx = 0;

            for (int j = 0; j < dq.size(); j++) {
                if (dq.get(j) == target) {
                    // 찾는 값이면 ??
                    idx = j;
                    break;
                }
            }

            // 왼쪽 회전
            if (half - idx >= 0) {
                // idx가 왼쪽에 있으면
                for (int j = 0; j < idx; j++) {
                    int first = dq.pollFirst();
                    dq.addLast(first);
                    cnt++;
                }
                dq.poll();
            }
            // 오른쪽 회전
            else {
                // idx가 오른쪽에 있으면
                for (int j = 0; j < dq.size() - idx; j++) {
                    int last = dq.pollLast();
                    dq.addFirst(last);
                    cnt++;
                }
                dq.poll();
            }
        }
        System.out.println(cnt);
    }
}