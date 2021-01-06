// 1436(영화감독 숌)

package Step11;

import java.io.*;

public class BOJ_1436
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		
		while(N>0){
			num++;
			String str = Integer.toString(num);
			if(str.contains("666")){
				N--;
			}
		}
		System.out.println(num);
	}
}