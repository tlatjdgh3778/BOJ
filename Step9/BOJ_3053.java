// 3053(택시 기하학)

package Step9;

import java.io.*;

public class BOJ_3053
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		System.out.printf("%.6f\n",(double)Math.PI*r*r);
		System.out.printf("%.6f",(double)2*r*r);
	}
}
