// 15552(빠른 A+B)

package Step3;

/* package whatever; // don't place package name! */

import java.util.*;
import java.io.*;

public class BOJ_15552
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=testcase; i++){
		String string = br.readLine();
		StringTokenizer st = new StringTokenizer(string," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int sum = A+B;
		
		bw.write(sum + "\n");
		}
		bw.flush();
	}
}
