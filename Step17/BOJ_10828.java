// 10828(스택)

package Step17;

import java.util.*;
import java.io.*;

public class BOJ_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        // 스택 생성 int 형
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            if (str.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if (stack.size() < 1) {
                    System.out.println(-1);
                } else
                    System.out.println(stack.pop());
            } else if (str.equals("size")) {
                System.out.println(stack.size());
            } else if (str.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else
                    System.out.println(0);
            } else if (str.equals("top")) {
                if (stack.size() < 1) {
                    System.out.println(-1);
                } else
                    System.out.println(stack.peek());
            }
        }
    }
}