// 1932(정수 삼각형)

package Step14;

import java.util.*;
import java.io.*;

public class BOJ_1932
{
	public static int N;
	public static int[][] arr; // 삼각형
	public static int[][] dp;  // 누적 합
	public static StringTokenizer st;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<=i; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp = new int[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				dp[i][j] = -1;
			}
		}
		// 삼각형 밑변 값을 dp에 저장
		for(int i=0; i<N; i++){
			dp[N-1][i] = arr[N-1][i];
		}
		System.out.println(f(0,0));
	}
	public static int f(int depth, int idx){
		if(depth == N - 1)
		// 만약 맨 밑의행에 도달하면 해당 인덱스를 반환
			return dp[depth][idx];
		
		if(dp[depth][idx] == -1){
			dp[depth][idx] = Math.max(f(depth + 1, idx), f(depth + 1, idx + 1)) + arr[depth][idx];
		}
		return dp[depth][idx];
	}
}
