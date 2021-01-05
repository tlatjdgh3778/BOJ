// 2439(별 찍기 - 2)

package Step3;

import java.io.*;

public class BOJ_2439
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++){
			for(int j=N-i+1; j>1; j--){
				bw.write(" ");
			}
			for(int k=1; k<=i; k++){
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
