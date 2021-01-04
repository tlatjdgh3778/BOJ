// 2562(최댓값)

package Step5;

import java.io.*;

public class BOJ_2562
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number[] = new int[9];
		int max = number[0];
		int index = 0;
		int count = 0;
		for(int i=0; i<number.length; i++){
			number[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<number.length; i++){
			count++;
			if(max<number[i]){
				max = number[i];
				index = count;
			}
		}
		System.out.printf("%d\n%d",max,index);
	}
}
