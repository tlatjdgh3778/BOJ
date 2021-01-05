// 10950(A+B - 3)
package Step3;

import java.util.*;
import java.io.*;

public class BOJ_10950
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine()); // 5
		
		for(int i=1; i<=testcase; i++){
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
			System.out.printf("%d",A+B);
			System.out.println();
		}
	}
}
