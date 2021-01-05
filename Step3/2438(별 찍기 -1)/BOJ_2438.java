// 2438(별 찍기 -1)

package Step3;

import java.io.*;

public class BOJ_2438
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++){
			for(int j=1; j<=i; j++){
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
