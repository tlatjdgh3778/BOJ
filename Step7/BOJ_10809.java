// 10809(알파벳 찾기)

package Step7;

import java.io.*;

public class BOJ_10809
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // a~z
		for(int i=0; i<arr.length; i++){
			arr[i] = -1; // init(-1)
		}
		String S = br.readLine();
		
		for(int i=0; i<S.length(); i++){
			char ch = S.charAt(i);
			
			if(arr[ch-'a']==-1){
				arr[ch-'a'] = i;
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.printf("%d ",arr[i]);
		}
	}
}