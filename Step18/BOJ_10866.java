// 10866(덱)

package Step18;

/* package whatever; // don't place package name! */

import java.util.*;
import java.io.*;

public class BOJ_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push_front")) {
                // 정수 X를 덱의 앞에 넣는다.
                // addFirst,offerFirst
                int X = Integer.parseInt(st.nextToken());
                dq.addFirst(X);
            } else if (str.equals("push_back")) {
                // 정수 X를 덱의 뒤에 넣는다.
                // add(Last),offer(Last)
                int X = Integer.parseInt(st.nextToken());
                dq.addLast(X);
            } else if (str.equals("pop_front")) {
                // 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다.
                // 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                if (!dq.isEmpty()) {
                    sb.append(dq.pollFirst() + "\n");
                } else {
                    sb.append("-1\n");
                }
            } else if (str.equals("pop_back")) {
                // 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다.
                // 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                if (!dq.isEmpty()) {
                    sb.append(dq.pollLast() + "\n");
                } else {
                    sb.append("-1\n");
                }
            } else if (str.equals("size")) {
                // 덱에 들어있는 정수의 개수를 출력한다.
                sb.append(dq.size() + "\n");
            } else if (str.equals("empty")) {
                // 덱이 비어있으면 1을, 아니면 0을 출력한다.
                if (dq.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (str.equals("front")) {
                // 덱의 가장 앞에 있는 정수를 출력한다.
                // 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                if (!dq.isEmpty()) {
                    sb.append(dq.getFirst() + "\n");
                } else {
                    sb.append("-1\n");
                }
            } else if (str.equals("back")) {
                // 덱의 가장 뒤에 있는 정수를 출력한다.
                // 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                if (!dq.isEmpty()) {
                    sb.append(dq.getLast() + "\n");
                } else {
                    sb.append("-1\n");
                }
            }
        }
        System.out.println(sb);
    }
}