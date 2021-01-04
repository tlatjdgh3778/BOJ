// 10951(A+B - 4)

package Step4;

import java.util.*;
import java.io.*;

public class BOJ_10951
{
	static StringTokenizer st;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string;
		//String string = br.readLine();
		//st = new StringTokenizer(string," ");
		while((string = br.readLine()) != null){
		st = new StringTokenizer(string," ");
	
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		bw.write(A+B+"\n");
		}
		bw.flush();
	}
}