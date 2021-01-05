// 1157(단어 공부)

package Step7;

import java.io.*;

public class BOJ_1157
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		
		String str = br.readLine();		
		str = str.toUpperCase();
		
		int max = 0;
		int index = 0;
		
		for(int i=0; i<str.length(); i++){
			int alpha = str.charAt(i);
			arr[alpha-65]++;
		}
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i+65;
			}
			else if(max==arr[i]){
				index = '?';
			}
		}
		System.out.println((char)index);
	}
}