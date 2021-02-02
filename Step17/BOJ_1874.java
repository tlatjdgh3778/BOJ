// 1874(스택 수열)

package Step17;

import java.util.*;
import java.io.*;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N]; // 원본 배열
        int brr[] = new int[N]; // 오름차순 배열
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            brr[i] = arr[i];
        }
        // Arrays.sort(brr);
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 1; i <= N; i++) {
            stack.push(i);
            sb.append("+\n");
            while (!stack.isEmpty() && arr[index] == stack.peek()) {
                // 스택이 비어있지 않고 꼭대기 값과 arr배열의 값이 같으면
                index++;
                stack.pop();
                sb.append("-\n");
            }
        }

        if (stack.isEmpty()) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }

    }
}