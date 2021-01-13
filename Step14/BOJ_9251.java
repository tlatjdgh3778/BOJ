// 9251(LCS)

package Step14;

import java.io.*;

public class BOJ_9251
{
	public static Integer[][] dp;
	public static String str1, str2;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		str1 = br.readLine(); // ACAYKP
		str2 = br.readLine(); // CAPCAK
		
		dp = new Integer[str1.length()][str2.length()];
		
		System.out.println(LCS(str1.length()-1, str2.length()-1));
	}
	public static int LCS(int x, int y){
		if(x == -1 || y == -1){
			return 0;
		}
		if(dp[x][y] == null){
			dp[x][y] = 0;
			if(str1.charAt(x) == str2.charAt(y)){
				// x-1, y-1 을 참조하는데
				// 만약 x,y 가 0부터 시작한다면 -1을 참조해버림..
				dp[x][y] = LCS(x-1, y-1) + 1;
			}else{
				dp[x][y] = Math.max(LCS(x-1,y),LCS(x,y-1));
			}
		}
		return dp[x][y];
	}
}