// 2839(설탕 배달)

package Step8;

import java.io.*;

public class BOJ_2839
{
	public static int[] dp;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp = new int[5001];
		
		// dp[i] = ikg를 만드는 방법의 수
		for(int i=0; i<=N; i++){
			dp[i] = 9999; // max 를 9999로 잡음
            // dp[7] = dp[4] dp[2] 중 작은 값 + 1 이니
            // 9999에 + 1 ,,, 
            // 만약에 MAX_VALUE로 잡으면 값이 초과됨.
		}
		dp[3] = dp[5] = 1;
		
		// 1. i-3 kg + 3kg
		// 2. i-5 kg + 5kg
		// 둘 사이의 최소
		for(int i=6; i<=N; i++){
			dp[i] = Math.min(dp[i-3],dp[i-5])+1;
		}
		if(dp[N] >= 9999){
			System.out.println("-1");
		}else{
		System.out.println(dp[N]);
		}
	}
}