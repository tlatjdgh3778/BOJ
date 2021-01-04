// 2742(기찍 N)

package Step3;

/* package whatever; // don't place package name! */

import java.io.*;

public class BOJ_2742
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++){
			System.out.println(N-i+1);
		}
	}
}