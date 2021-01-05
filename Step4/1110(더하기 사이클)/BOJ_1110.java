// 1110(더하기 사이클)

package Step4;

import java.io.*;

public class BOJ_1110
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int copy = N;
		// N%10
		// (int)(N/10)
		int cnt = 0;
		
		while(true){
		int a = copy%10; // 1 의자리
		int b = copy/10; // 10 의자리
		
		if(a+b<10){
			copy = a*10 + a+b;
		}
		else{
			copy = a*10 +(a+b)%10;
		}
		cnt++;
		if(copy==N){
			break;
			}
		}
		System.out.println(cnt);
		//bw.flush();
	}

}
