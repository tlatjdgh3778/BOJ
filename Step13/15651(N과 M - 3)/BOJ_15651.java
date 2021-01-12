// 15651(N과 M - 3)

package Step13;

import java.util.*;
import java.io.*;

public class BOJ_15651
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
		dfs(0);
		System.out.print(sb);
		
	}
	public static void dfs(int depth){
		if(M == depth){
			for(int i=0; i<M; i++){
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0; i<N; i++){
			arr[depth] = i + 1;
			dfs(depth+1);
		}
	}
}

