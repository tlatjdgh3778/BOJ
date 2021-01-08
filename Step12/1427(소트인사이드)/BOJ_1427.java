// 1427(소트인사이드)

package Step12;

import java.io.*;

public class BOJ_1427
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] arr = new int[str.length()];
		
		for(int i=0; i<str.length(); i++){
			arr[i] = str.charAt(i)-'0';
		}
		int tmp = 0;
		for(int i=0; i<arr.length-1; i++){
			for(int j=1; j<arr.length-i; j++){
				if(arr[j-1]<arr[j]){
					//swap
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
	}
}
