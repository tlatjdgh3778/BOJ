// 2741(N 찍기)

package Step3;

import java.io.*;

public class BOJ_2741
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++){
			System.out.println(i);
		}
	}
}