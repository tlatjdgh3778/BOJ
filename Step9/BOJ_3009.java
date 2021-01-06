// 3009(네 번째 점)

package Step9;

import java.util.*;
import java.io.*;

public class BOJ_3009
{
	public static void main (String[] args) throws IOException
	{
		int x = 0;
		int y = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());	
		if(x1==x2){x=x3;}
		if(x1==x3){x=x2;}
		if(x2==x3){x=x1;}
		
		if(y1==y2){y=y3;}
		if(y1==y3){y=y2;}
		if(y2==y3){y=y1;}
		
		System.out.printf("%d %d", x,y);
	}
}