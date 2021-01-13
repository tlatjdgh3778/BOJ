// 1912(연속합)

package Step14;

import java.util.*;
import java.io.*;

public class BOJ_1912
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[100001];
		int[] dp = new int[100001];
		
		// dp[n] = n 번째 인덱스까지의 합들 중 최대합..
		// dp[n] = Math.max(dp[n], dp[n-1] + arr[n])
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = arr[i]; 
			// dp를 arr로 초기화 해주는 이유는
			// 자기 자신의 값이 최대일수도 있으니까 ㅇ
		}
		int max = dp[0];
		for(int i=1; i<n; i++){
			dp[i] = Math.max(dp[i], dp[i-1] + arr[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
