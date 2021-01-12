// 15650(N과 M - 2)

package Step13;

import java.util.*;
import java.io.*;

public class BOJ_15650
{
	public static int[] arr;
	public static int N, M;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		dfs(1,0);
	}
	public static void dfs(int at, int depth){
		
		if(M == depth){
			for(int val : arr){
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = at; i <= N; i++){
			arr[depth] = i;
			dfs(i+1, depth + 1);
		}
	}
}