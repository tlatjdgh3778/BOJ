// 2750(수 정렬하기)

package Step12;

import java.io.*;

public class BOJ_2750
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int tmp = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=1; j<arr.length-i; j++){
				if(arr[j]<arr[j-1]){
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}