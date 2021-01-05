// 2739(구구단)

package Step3;

import java.io.*;

public class BOJ_2739
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<10; i++){
			System.out.println(N+" * "+i+" = "+N*i);
		}
	}
}
