// 9184(신나는 함수 실행)

package Step14;

import java.util.*;
import java.io.*;

public class BOJ_9184
{
	public static int a, b, c;
	public static int dp[][][];
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		dp = new int[51][51][51];
		
		for(int a=0; a<21; a++){
			for(int b=0; b<21; b++){
				for(int c=0; c<21; c++){
					if(a==0 || b==0 || c==0){
						dp[a][b][c] = 1;
					}
					else if(a<b && b<c){
						dp[a][b][c] = dp[a][b][c-1] + dp[a][b-1][c-1] - dp[a][b-1][c];
					}else{
						dp[a][b][c] = dp[a-1][b][c] + dp[a-1][b-1][c] + dp[a-1][b][c-1] - dp[a-1][b-1][c-1];
					}
				}
			}
		}		
	while(true){
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			if(a==-1 && b==-1 && c==-1){
				break;
			}
			
			if(a<=0 || b<=0 || c<=0){
				System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,1);
			}
			else if(a>20 || b>20 || c>20){
				System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,dp[20][20][20]);
			}else if(a<b && b<c){
			System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,dp[a][b][c]);
			}
			else{
			System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,dp[a][b][c]);
			}
		}
    }
}