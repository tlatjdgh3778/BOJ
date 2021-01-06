// 10870(피보나치 수 5)

package Step10;


import java.io.*;

public class BOJ_10870
{
	public static int[] dp;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new int[21]; // n<=20
		dp[0] = 0; // 0번
		dp[1] = 1; // 1번
		
		// Fn = F(n-1) + F(n-2) (n>=2)
		System.out.println(fibo(n));
	}
	public static int fibo(int n){
		if(n<=1){
			return dp[n];
		}else{
			return dp[n] = fibo(n-1) + fibo(n-2);
		}
	}
}
