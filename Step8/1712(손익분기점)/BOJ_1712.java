// 1712(손익분기점)

package Step8;

import java.util.*;
import java.io.*;

public class BOJ_1712
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int res = 0;
		
		int A = Integer.parseInt(st.nextToken()); // 고정비
		int B = Integer.parseInt(st.nextToken()); // 변동액
		int C = Integer.parseInt(st.nextToken()); // 매출액
		// 손익분기점 = 고정비 / (1 - (변동액 / 매출액))
		if(B>=C) //변동비(원가)가 매출액보다 클 경우 손익분기점 X
		{
			res = -1;
		}
		else{
		//int bep = A / (1 - (B/C)); // 손익분기점
		
		res = A/(C-B)+1; 
		}
			System.out.println(res);
	}
}
