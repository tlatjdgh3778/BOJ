// 18258(큐 2)

package Step18;

import java.util.*;
import java.io.*;

public class BOJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Queue<Integer> q = new LinkedList<>();
        int a = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                a = Integer.parseInt(st.nextToken());
                q.offer(a);
            } else if (str.equals("pop")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.poll() + "\n");
                }
            } else if (str.equals("size")) {
                sb.append(q.size() + "\n");
            } else if (str.equals("empty")) {
                if (q.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (str.equals("front")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.element() + "\n");
                }
            } else if (str.equals("back")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(a + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}