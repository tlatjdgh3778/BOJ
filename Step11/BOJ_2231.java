// 2231(분해합)

package Step11;

import java.io.*;

public class BOJ_2231
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int X = N;
		int res = 0;
		while(X>0){
			X--; // 215
			int sum = X;
			int Y = X;
			while(Y!=0){
				sum = sum + Y%10; // 각 자릿수 덧셈
				Y = Y/10;
			}
			if(sum == N){
				res = X;
			}
		}
		System.out.println(res);
	}
}