// 11654(아스키 코드)

package Step7;

import java.io.*;

public class BOJ_11654
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ch = br.readLine();
		int a = ch.charAt(0);
		System.out.println(a);
	}
}
