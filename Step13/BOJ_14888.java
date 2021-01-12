// 14888(연산자 끼워넣기)

package Step13;

import java.util.*;
import java.io.*;

public class BOJ_14888
{
	public static int MAX = Integer.MIN_VALUE; // 최댓값
	public static int MIN = Integer.MAX_VALUE; // 최솟값
	public static int N; // 숫자의 개수
	public static int[] arr; // 수열
	public static int[] operator = new int[4]; // 연산자 배열
	public static StringTokenizer st;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		// 수열 채우기
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 연산자 채우기 + - * /
		st = new StringTokenizer(br.readLine()," ");		
		for(int i=0; i<4; i++){
			operator[i] = Integer.parseInt(st.nextToken());
		}
		dfs(arr[0], 1);
		System.out.println(MAX);
		System.out.println(MIN);
	}
	public static void dfs(int num, int index){
		if(index == N){
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		for(int i=0; i<4; i++){
			// 연산자 개수가 1 이상이면 ???
			if(operator[i]>0){
				// 그 연산자 1 빼고
				operator[i]--;
				
				switch(i){
					case 0: dfs(num + arr[index], index+1); break;
					case 1: dfs(num - arr[index], index+1); break;
					case 2: dfs(num * arr[index], index+1); break;
					case 3: dfs(num / arr[index], index+1); break;
				}
				// i 0일 때 다 돌면 연산자 개수 복구 ㅇㅇ.
				operator[i]++;
			}
		}
		
		
		
	}
}