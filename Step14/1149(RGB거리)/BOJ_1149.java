// 1149(RGB거리)

package Step14;

import java.util.*;
import java.io.*;

public class BOJ_1149
{
	static final int RED = 0;
	static final int GREEN = 1;
	static final int BLUE = 2;
	public static int[][] cost;   // 3가지 케이스 배열
	public static int[][] dp;     // 누적합을 저장할 배열
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		cost = new int[N][3]; 
		dp = new int[N][3]; // 누적합
		// 초기화.
		StringTokenizer st;
		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine()," ");
				cost[i][RED] = Integer.parseInt(st.nextToken());
				cost[i][GREEN] = Integer.parseInt(st.nextToken());
				cost[i][BLUE] = Integer.parseInt(st.nextToken());
		}
		
		// dp 첫번째 값은 각 색상비용의 첫번째 값으로 초기화
		dp[0][RED] = cost[0][RED];
		dp[0][GREEN] = cost[0][GREEN];
		dp[0][BLUE] = cost[0][BLUE];
		
		System.out.println(Math.min(paint_cost(N-1,RED), Math.min(paint_cost(N-1, GREEN), paint_cost(N-1, BLUE))));
	}
	public static int paint_cost(int n, int color){
		//만약 탐색하지 않은 배열
		if(dp[n][color] == 0){
			
			//red, green, blue
			if(color==RED){
				// red면 n-1 번째 greed, blue 중 작은 값이랑 레드의 누적합을 dp에 저장 ㅇㅇ
				dp[n][RED] = Math.min(paint_cost(n-1, GREEN), paint_cost(n-1, BLUE)) + cost[n][RED];
			}
			else if(color==GREEN){
				dp[n][GREEN] = Math.min(paint_cost(n-1, RED), paint_cost(n-1, BLUE)) + cost[n][GREEN];
			}
			else{
				dp[n][BLUE] = Math.min(paint_cost(n-1, RED), paint_cost(n-1, GREEN)) + cost[n][BLUE];
			}
		}
		return dp[n][color];
	}
	
}
