// 10844(쉬운 계단 수)

package Step14;

import java.io.*;

public class BOJ_10844
{
	//public static int N;
	public static Long[][] dp;
	final static long mod = 1000000000;
	//public static int[] arr;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new Long[N+1][10]; // 자릿수, 자릿값
		
		/*for(int i=0; i<=N+1; i++){
			for(int j=0; j<10; j++){
				dp[i][j] = -1;
			}
		}*/
		for(int i=0; i<10; i++){
			dp[1][i] = 1L; 
		}
		long res = 0;
		for(int i=1; i<=9; i++){
			res = res + f(N,i);
		}
		System.out.println(res % mod);
	}
	public static long f(int digit, int val){
		if(digit == 1){
			return dp[digit][val];
		}	
	
		if(dp[digit][val] == null){
			if(val == 0){
				dp[digit][val] = f(digit-1,1);
			}
			else if(val == 9){
				dp[digit][val] = f(digit-1,8);
			}
			else{
				dp[digit][val] = f(digit-1,val-1) + f(digit-1,val+1);
			}
		}
		return dp[digit][val] % mod;
	}
}
