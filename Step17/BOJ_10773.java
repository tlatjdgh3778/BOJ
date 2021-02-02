// 10773(제로)

package Step17;

import java.util.*;
import java.io.*;

public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        // System.out.println(stack.size());
        int sum = 0;
        /*
         * if(stack.isEmpty()){ System.out.println(0); }else{ for(int i=0;
         * i<stack.size()+1; i++){ sum = sum + stack.pop(); } System.out.println(sum);}
         */
        while (!stack.isEmpty()) {
            sum = sum + stack.pop();
        }
        System.out.println(sum);
    }
}