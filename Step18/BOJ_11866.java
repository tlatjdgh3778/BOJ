// 11866(요세푸스 문제 0)

package Step18;

import java.util.*;
import java.io.*;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int num = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        while (!q.isEmpty()) {
            for (int i = 0; i < M - 1; i++) {
                num = q.poll();
                q.offer(num);
            }
            sb.append(q.poll() + ", ");
        }
        System.out.println("<" + sb.substring(0, sb.length() - 2) + ">");
    }
}