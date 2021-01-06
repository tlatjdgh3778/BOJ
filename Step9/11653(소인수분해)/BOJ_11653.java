// 11653(소인수분해)

package Step9;

import java.io.*;

public class BOJ_11653
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=2; i<=N; i++){
			while(N%i == 0){
				System.out.println(i);
				N = N/i;
			}
		}
	}
}
