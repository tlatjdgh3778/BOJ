// 1065(한수)

package Step6;

import java.io.*;

public class BOJ_1065
{	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int a =0, b=0, c=0, d=0;
		//a = N%10;			//1
		//b = (N/10)%10;		//10
		//c = ((N/10)/10)%10; //100
		
		if(N<100){
			System.out.printf("%d",N);
		}
		else if(100<=N || N <=1000){
			for(int i=100; i<=N; i++){
				a = i%10;				 //1
				b = (i/10)%10;		 	 //10
				c = ((i/10)/10)%10; //100
				if((a-b)==(b-c)&& N<1000){
					cnt++;
					}
				if(N==1000){
					d = (((i/10)/10)/10)%10; //1000
					if((a-b)==(b-c)&& i<1000){
						cnt++;
						}
					else if(i>=1000 && (a-b)==(b-c)&&(b-c)==(c-d)){
						cnt++;
						}
				}
				}
			System.out.printf("%d",cnt+99);
		}
	}
}
