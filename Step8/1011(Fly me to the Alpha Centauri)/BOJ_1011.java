// 1011(Fly me to the Alpha Centauri)

package Step8;

import java.util.*;
import java.io.*;

public class BOJ_1011
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i =0; i<T; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			int distance = Y-X;
			int max = (int)Math.sqrt(distance); // 소수점은 버림
			
			if(max == Math.sqrt(distance)){
				System.out.println(2*max -1);
			}
			else if(distance<= max*max + max){
				System.out.println(2*max);
			}
			else{
				System.out.println(2*max+1);
			}
		}
	}
}
