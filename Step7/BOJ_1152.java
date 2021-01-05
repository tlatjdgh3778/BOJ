// 1152(단어의 개수)

package Step7;

import java.util.*;
import java.io.*;

public class BOJ_1152
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println(st.countTokens());
		
		/*while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}*/
	}
}