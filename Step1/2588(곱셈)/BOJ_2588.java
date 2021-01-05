// 2588(곱셈).

package Step1;

import java.io.*;

public class BOJ_2588
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		double sum = 0;
		int cnt = 0;
		double x = 0;
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++){
			arr[i] = B.charAt(i)-'0';
		}
		for(int i=arr.length-1; i>=0; i--){
				x = Math.pow(10,cnt);
				System.out.println((arr[i] * A));
				sum = sum + (arr[i] * A) * x;
				cnt++;
				//System.out.println(sum);
		}
		System.out.println((int)sum);
	}
}
