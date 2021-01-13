// 9461(파도반 수열)

package Step14;

import java.io.*;

public class BOJ_9461
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		// 점화식
        // dp[n] = dp[n-2] + dp[n-3]
        
		for(int i=0; i<t; i++){
			int k = Integer.parseInt(br.readLine());
			
			long[] dp = new long[101];  // 1<=n<=100
			
			dp[1] = dp[2] = dp[3] = 1;
			//dp[4] = dp[5] = 2;
			
			for(int j=4; j<=k; j++){
				dp[j] = dp[j-2] + dp[j-3];
			}
			System.out.println(dp[k]);
		}
	}
}
