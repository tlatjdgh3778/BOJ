// 15652(N과 M - 4)

package Step13;

import java.util.*;
import java.io.*;

public class BOJ_15652
{
	public static int N,M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		dfs(1, 0);
		System.out.print(sb);
		
	}
	public static void dfs(int at, int depth){
		if(M == depth){
			for(int i=0; i<M; i++){
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i=at; i<=N; i++){
			arr[depth] = i;
			dfs(i, depth+1);
		}
	}
}
