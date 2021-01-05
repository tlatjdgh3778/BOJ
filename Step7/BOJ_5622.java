// 5622(다이얼)

package Step7;

import java.io.*;

public class BOJ_5622
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char ch;
		int time = 0;
		int sum = 0;
		
		for(int i=0; i<str.length(); i++){
			ch = str.charAt(i);
			if(ch=='A' || ch=='B' || ch=='C'){
				time = 3;
				sum = sum + time;
			}else if(ch=='D' || ch=='E' || ch=='F'){
				time = 4;
				sum = sum + time;
			}else if(ch=='G' || ch=='H' || ch=='I'){
				time = 5;
				sum = sum + time;
			}else if(ch=='J' || ch=='K' || ch=='L'){
				time = 6;
				sum = sum + time;
			}else if(ch=='M' || ch=='N' || ch=='O'){
				time = 7;
				sum = sum + time;
			}else if(ch=='P' || ch=='Q' || ch=='R' || ch=='S'){
				time = 8;
				sum = sum + time;
			}else if(ch=='T' || ch=='U' || ch=='V'){
				time = 9;
				sum = sum + time;
			}else if(ch=='W' || ch=='X' || ch=='Y' || ch=='Z'){
				time = 10;
				sum = sum + time;
			}
		}
		System.out.println(sum);
	}
}