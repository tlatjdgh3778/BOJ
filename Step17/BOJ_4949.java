// 4949(균형잡힌 세상)

package Step17;

import java.util.*;
import java.io.*;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while (!(str = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();

            boolean chk = true;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                // 한 문장 한 단어씩 검사

                if (c == '(' || c == '[') {
                    // 여는 괄호. 스택에 삽입
                    stack.push(c);
                } else if (c == ')') {
                    // 닫는 괄호
                    // 빈 스택, peek 여는 괄호 없을 때, 있을 때 3가지
                    if (stack.isEmpty() || stack.pop() != '(') {
                        chk = false;
                        break;
                    }
                } else if (c == ']') {
                    // 닫는 괄호
                    // 빈 스택, peek 여는 괄호 없을 때, 있을 때 3가지
                    if (stack.isEmpty() || stack.pop() != '[') {
                        chk = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                chk = false;
            }
            if (chk == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        } // end while.
    }
}