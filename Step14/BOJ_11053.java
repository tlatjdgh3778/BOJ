// 11053(가장 긴 증가하는 부분 수열)

package Step14;

import java.util.*;
import java.io.*;

public class BOJ_11053
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[1001];
		int[] dp = new int[1001];
		
		// dp[n] = n 번째에서 가장 긴 증가하는 부분 수열의 길이.
		// dp[3] = arr[2] < arr[3], dp[3] < dp[2] + 1 = dp[3] = 2;
		//                            30     {10}    30
		// dp[3] = arr[1] < arr[3], dp[3] < dp[1] + 1 = dp[3] = 3;
		//                          10 30   {10 20}  30
		// dp[3] = arr[0] < arr[3], dp[3] < dp[0] + 1 = dp[3] = 3;
		//                        10 20 30   {10}    30  
		
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = 1;
		
		for(int i=0; i<n; i++){
			dp[i] = 1;
			
			for(int j=0; j<n; j++){
				if(arr[j] < arr[i] && dp[i] < dp[j] + 1){
					dp[i] = dp[j] + 1;
				}
			}
		}
		int max = 0;
		for(int i=0; i<n; i++){
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
	}
}