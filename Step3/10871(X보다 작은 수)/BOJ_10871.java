// 10871(X보다 작은 수)

package Step3;

import java.util.*;
import java.io.*;

public class BOJ_10871
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string1 = br.readLine();
		StringTokenizer st = new StringTokenizer(string1," ");
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		String string2 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(string2," ");
		for(int i=0; i<N; i++){
			int a = Integer.parseInt(st1.nextToken());
			if(a<X){
				bw.write(a+" ");
			}
		}
		bw.flush();
	}
}
