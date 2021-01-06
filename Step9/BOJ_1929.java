// 1929(소수 구하기)

package Step9;

import java.util.*;
import java.io.*;

public class BOJ_1929
{
	public static boolean[] primeNum;
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		primeNum = new boolean[N+1];
		primeNum[1] = true; // true 면 소수 아님.. 기본값 false
		
		for(int i=2; i<primeNum.length; i++){
			for(int j=2; i*j<primeNum.length; j++){
				primeNum[i*j] = true; // i의 배수 true로 
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=M; i<=N; i++){
			if(!primeNum[i]){
				sb.append(i+"\n");
			}
		}
		System.out.println(sb.toString());
	}
}
