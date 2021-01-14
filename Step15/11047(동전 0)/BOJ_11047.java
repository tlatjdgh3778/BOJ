// 11047(동전 0)

package Step15;

import java.util.*;
import java.io.*;

public class BOJ_11047
{
	public static StringTokenizer st;
	public static int N,K;
	public static int res = 0;
	public static int sum =0;
	public static int[] arr;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(br.readLine());
			// {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000}
		}
		for(int i = N-1; i>=0; i--){
			if(K>=arr[i]){
				sum = sum + K/arr[i];
				K = K%arr[i];
			}
		}
		System.out.println(sum);
	}
	/*public static int greedy(int x, int n){
		// x = 4200
		// n = 동전 개수
		if(x/arr[n-1] == 0){
			greedy(x, n-1);
		}else{
			res = res + x/arr[n-1];
			x = x%arr[n-1];
		}
		return res;
	}*/
}
