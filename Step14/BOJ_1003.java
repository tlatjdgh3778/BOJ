// 1003(피보나치 함수)

package Step14;

import java.io.*;

public class BOJ_1003
{
	public static int zero_cnt, one_cnt = 0;
	public static int[][] dp;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		dp = new int[41][2]; // 뒤에 0,1 의 개수
		for(int i=0; i<41; i++){
			for(int j=0; j<2; j++){
				dp[i][j] = -1;
			}
		}
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		//     0개 1개
		// f(0) 1  0
		// f(1) 0  1
		for(int i=0; i<t; i++){
			int k = Integer.parseInt(br.readLine());
			f(k);
			sb.append(dp[k][0]+" "+dp[k][1]).append("\n");
			//System.out.println(dp[k][0]+" "+dp[k][1]);
		}
		System.out.println(sb);
	}
	
	public static int[] f(int n){
		if(dp[n][0] == -1 && dp[n][1] == -1){
			// 처음 탐색하는 값이면 
		dp[n][0] = f(n-1)[0] + f(n-2)[0]; // 0의 개수
		dp[n][1] = f(n-1)[1] + f(n-2)[1]; // 1의 개수
		}
		return dp[n]; // n에 대한 0,1 [n][0] 과 [n][1] 을 담고있는 [n]을 반환
	}
}