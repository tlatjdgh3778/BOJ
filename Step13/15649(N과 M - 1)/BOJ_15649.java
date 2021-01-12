// 15649(N과 M - 1)

package Step13;

import java.util.*;
import java.io.*;

public class BOJ_15649
{
	public static int[] arr;
	public static boolean[] visit;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		visit = new boolean[N];
		//int depth = 0;
		dfs(N,M,0);
	}
	public static void dfs(int N, int M, int depth){
		
		if(M == depth){
			for(int val : arr){
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<N; i++){
			if(visit[i] == false){
				visit[i] = true;
				arr[depth] = i+1;
				dfs(N, M, depth + 1);
				
				visit[i] = false;
			}
		}
		return;
	}
}
