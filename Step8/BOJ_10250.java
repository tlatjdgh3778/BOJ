// 10250(ACM 호텔)

package Step8;

import java.util.*;
import java.io.*;

public class BOJ_10250
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt(st.nextToken()); // 층 수 
			int W = Integer.parseInt(st.nextToken()); // 방 수 
			int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님 ..
	
			for(int j=1; j<=W; j++){
				for(int k=1; k<=H; k++){
					N--;
					if(N==0){
					if(j<10){
						System.out.printf("%d" + "%d" + "%d\n",k,0,j);
					}
					else if(j>=10){
						System.out.printf("%d" + "%d\n",k,j);	
					}
					}
				}
			}
			
		}
	}
}