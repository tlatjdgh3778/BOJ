// 11729(하노이 탑 이동 순서)

package Step10;

import java.io.*;

public class BOJ_11729
{
	public static int cnt = 0;
	public static StringBuilder sb = new StringBuilder();
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N,1,3);
		System.out.println(cnt);
		System.out.println(sb);
	}
	public static void hanoi(int n, int from, int to){
		//1. 원반 n-1개 A->B
		//2. 밑판 A->C
		//3. 원반 n-1개 B->C
		int middle = 6 - from - to;
		if(n == 1){
			//종료 조건
			cnt++;
			sb.append(from + " " + to + '\n');
		}else if(n >= 2){
			hanoi(n-1, from, middle);
			hanoi(1, from, to);
			hanoi(n-1, middle, to);
		}
	}
}
