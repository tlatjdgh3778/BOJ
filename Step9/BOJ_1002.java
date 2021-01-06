// 1002(터렛)

package Step9;

import java.util.*;
import java.io.*;

public class BOJ_1002
{
	public static StringTokenizer st;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TestCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<TestCase; i++){ //TestCase 만큼 반복
			st = new StringTokenizer(br.readLine()," ");
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double r1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double r2 = Double.parseDouble(st.nextToken());
			int distance = (int)Math.pow((x2-x1),2)+ (int)Math.pow((y2-y1),2);
			// 원의 중앙이 같거나 다름
			// 같으면 원의 크기가 클(2) 작은(0) 같은(-1)
			if(x1==x2 && y1==y2 && r1==r2){ //원의 중앙이 같
				System.out.println("-1");
			}else if(distance > Math.pow((r1+r2),2)){
				System.out.println("0");
			}else if(distance < Math.pow((r1-r2),2)){
				System.out.println("0");
			}else if(distance == Math.pow((r1-r2),2)){
				System.out.println("1");
			}else if(distance == Math.pow((r1+r2),2)){
				System.out.println("1");
			}else{
				System.out.println("2");
			}   
		}
	}
}
