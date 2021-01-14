// 1541(잃어버린 괄호)

package Step15;

import java.util.*;
import java.io.*;

public class BOJ_1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정 
		StringTokenizer st1 = new StringTokenizer(br.readLine(), "-");
 
		while (st1.hasMoreTokens()) {
			int temp = 0;
			// 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
			StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "+");
			// 덧셈으로 나뉜 토큰들을 모두 더한다. 
			while (st2.hasMoreTokens()) {
				temp += Integer.parseInt(st2.nextToken());
			}

			// 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
 
}
