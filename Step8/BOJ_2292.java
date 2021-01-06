// 2292(벌집)

package Step8;

import java.io.*;

public class BOJ_2292
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int range = 2;
		int cnt = 1;
		
		if(N==1){
			System.out.println(1);
		}
		else{
			while(N>=range){
				range = range + (6 * cnt); // 범위 최솟값으로 초기화
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
