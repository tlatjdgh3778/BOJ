// 1001(A-B)
package Step1;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BOJ_1001
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int sum = A - B;
		System.out.println(sum);
	}
}
