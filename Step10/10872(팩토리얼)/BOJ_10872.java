// 10872(팩토리얼)

package Step10;

import java.io.*;

public class BOJ_10872
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(factorial(n));
	}
	public static int factorial(int n){
		
		int sum = 1;
		for(int i=1; i<=n; i++){
			sum = sum*i;
		}
		return sum;
	}
}
