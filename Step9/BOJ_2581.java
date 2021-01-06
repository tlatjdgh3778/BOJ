// 2581(소수)

package Step9;

import java.io.*;

public class BOJ_2581
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int prime = 0;
		int sum = 0;
		int min = N;
		for(int i=M; i<=N; i++){
			int cnt = 0; // 
			int a = i;
			for(int j=1; j<=a; j++){
				if(a%j == 0){
					cnt++;
				}
			}
			if(cnt==2){  // 2번 나누어 떨어지는 수(소수)
				sum = sum + i;
				prime++;
				if(min>i){
					min = i;
				}
				}
		}if(prime>0){
		System.out.println(sum);
		System.out.println(min);
			
		}
		else if(prime==0){
			System.out.println(-1);
			
		}
		}
}
