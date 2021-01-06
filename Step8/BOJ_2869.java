// 2869(달팽이는 올라가고 싶다)

package Step8;

import java.util.*;
import java.io.*;

public class BOJ_2869
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken()); // 낮에 올라간
		int B = Integer.parseInt(st.nextToken()); // 밤에 내려간
		int V = Integer.parseInt(st.nextToken()); // 총 나무 길이
		int day = (V-B)/(A-B);
		if((V-B)%(A-B)!=0){
			day++;
		}
	
		System.out.println(day);
	}
}