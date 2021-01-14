// 11399(ATM)

package Step15;

import java.util.*;
import java.io.*;

public class BOJ_11399
{
	public static StringTokenizer st;
	public static int N;
	public static int[] arr;
	public static int[] brr;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		brr = new int[N+1];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++){
		arr[i] = Integer.parseInt(st.nextToken());
		}
		//arr 배열 오름차순 정렬
		Arrays.sort(arr); 
		
		for(int i=1; i<N+1; i++){
			brr[i] = brr[i-1] + arr[i];
			sum = sum + brr[i];
		}
		System.out.println(sum);
	}
}
