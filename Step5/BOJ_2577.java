// 2577(숫자의 개수)

package Step5;

import java.io.*;

public class BOJ_2577
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int mul = A * B * C;
		//int cnt = 0;
		//int[] score = new int[];
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<array.length; i++){
			int cnt = 0;
			int tmp = mul;
			
			while(tmp!=0){
				if(tmp%10 == array[i]){
					cnt++;
				}
				tmp = tmp/10;
			}
			System.out.printf("%d\n",cnt);
		}
	}
}