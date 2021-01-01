// 1008(A/B)

package Step1;

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class BOJ_1008
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		double sum = A / B;
		System.out.println(sum);
	}
}