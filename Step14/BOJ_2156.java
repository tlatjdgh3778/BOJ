// 2156(포도주 시식)

package Step14;

import java.io.*;

public class BOJ_2156
{
	public static int N;
	public static int arr[];
	public static Integer dp[];
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		dp = new Integer[N+1];
		
		for(int i=1; i<N+1; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
			dp[0] = 0;
			dp[1] = arr[1];
			if(N>1)
			{
				dp[2] = arr[1] + arr[2];
			}
		System.out.println(f(N));
	}
	public static int f(int n){
		if(dp[n] == null){
			dp[n] = Math.max(Math.max(f(n-3)+arr[n-1]+arr[n],f(n-2)+arr[n]),f(n-1));
		}
		return dp[n];
	}
}