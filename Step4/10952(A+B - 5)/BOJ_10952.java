// 10952(A+B - 5).
package Step4;

import java.util.*;
import java.io.*;

public class BOJ_10952
{
	static StringTokenizer st;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//String string = br.readLine();
		//st = new StringTokenizer(string," ");
		while(true){
		String string = br.readLine();
		st = new StringTokenizer(string," ");
	
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
			if((A+B) == 0)
			{
				break;
			}
		bw.write(A+B+"\n");
		}
		bw.flush();
	}
}
