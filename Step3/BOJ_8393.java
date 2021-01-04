// 8393(합)

package Step3;

import java.io.*;

public class BOJ_8393
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
		    sum = sum + i;
		}
		System.out.println(sum);
	}
}