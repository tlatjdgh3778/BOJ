// 12865(평범한 배낭)

package Step14;

import java.util.*;
import java.io.*;

public class BOJ_12865
{
	public static Integer[][] dp;
	public static int[] W;
	public static int[] V;
	public static int N, k;
	public static StringTokenizer st;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		W = new int[N];
		V= new int[N];
		dp = new Integer[N][k+1];
		
		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(knapsack(N-1, k));
	}
	public static int knapsack(int i, int k){
		if(i < 0){
			return 0;
		}
		// 탐색하지 않은
		if(dp[i][k] == null){
			// 현재 무게가 k 보다 작으면.. 수용 못하면
			if(W[i] > k){
				// 이전 i값을 넣음
				dp[i][k] = knapsack(i-1, k);
			}
			// 현재 물건을 담을 수 있는 경우 
			else if(W[i] <= k){
				// 이전 i값, 이전 i값에 - 현재 무게 + 현재 가치
				dp[i][k] = Math.max(V[i]+knapsack(i-1,k-W[i]), knapsack(i-1,k));	
			}
		}
		return dp[i][k];
	}
}