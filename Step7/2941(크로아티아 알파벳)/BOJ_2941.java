// 2941(크로아티아 알파벳)

package Step7;

import java.io.*;

public class BOJ_2941
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String str = br.readLine();
		for(int i=0; i<arr.length; i++){
			str = str.replaceAll(arr[i],"*");
		}
		System.out.println(str.length());
	}
}
