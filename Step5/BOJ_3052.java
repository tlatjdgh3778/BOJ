// 3052(나머지)

package Step5;

import java.io.*;

public class BOJ_3052
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int brr[] = new int[42];
		int num = 0;
		
		for(int i=0; i<10; i++){
			num = Integer.parseInt(br.readLine());
			brr[num%42]++;
		}
		int cnt = 0;
		for(int i=0; i<42; i++){
			if(brr[i]>0){
				cnt++;
			}
		}
		System.out.printf("%d",cnt);
	}
}