// 10989(수 정렬하기 3)

package Step12;

import java.io.*;

public class BOJ_10989
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] cnt = new int[10001]; // 수의 범위
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++){
			// 해당 index의 값을 1 증가시킴
			cnt[Integer.parseInt(br.readLine())]++;
		}
		//하고나면 5가 얼마나 1이 얼마나 나왔는지 알 수 있음..
		
		for(int i=1; i<10001; i++){
			// i=0은 입력범위 아님
			while(cnt[i] > 0){
				// i 값이 개수가 0이 될 때 까지 출력.. 빈도 수
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		System.out.println(sb);
			

	}
}