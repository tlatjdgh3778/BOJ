// 2164(카드 2)

package Step18;

import java.util.*;
import java.io.*;

public class BOJ_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        // StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        } // 큐에 저장
          // 큐 처음 값 삭제 후 그 다음 값 삽입.
        while (q.size() != 1) {
            q.remove();
            if (q.size() == 1) {
                break;
            }
            q.add(q.element());
            q.remove();
        }
        System.out.println(q.element());
    }
}