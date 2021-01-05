// 11022(A+B - 8)

package Step3;

import java.util.*;
import java.io.*;

public class BOJ_11022
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=testcase; i++){
		String string = br.readLine();
		StringTokenizer st = new StringTokenizer(string, " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int sum = A+B;
		bw.write("Case #"+i+": "+A+" + "+B+" = "+sum+"\n");
		}
		bw.flush();
	}
}
