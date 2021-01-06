// 1978(소수 찾기)

package Step9;

import java.util.*;
import java.io.*;

public class BOJ_1978
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int prime = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++){
			int cnt = 0; // 
			int a = Integer.parseInt(st.nextToken());
			for(int j=1; j<=a; j++){
				if(a%j == 0){
					cnt++;
				}
			}
			if(cnt==2){  // 2번 나누어 떨어지는 수(소수)
				prime++;
				}
		}
		System.out.println(prime);
	}
}