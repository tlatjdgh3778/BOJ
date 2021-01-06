// 2798(블랙잭)

package Step11;

import java.util.*;
import java.io.*;

public class BOJ_2798
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," "); // N, M
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++){
		arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		int max = 0;
		
		for(int i=0; i<=N-3; i++){
			for(int j=i+1; j<=N-2; j++){
				for(int k=j+1; k<=N-1; k++){
					sum = arr[i] + arr[j] + arr[k];
					if(sum <= M && max <= sum){
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}
}