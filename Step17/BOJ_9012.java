// 9012(괄호)

package Step17;

import java.util.*;
import java.io.*;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            boolean vps = true;
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else if (str.charAt(j) == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        vps = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                vps = false;
            }
            if (vps) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}