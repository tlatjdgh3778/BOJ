// 2675(문자열 반복)

package Step7;

import java.util.*;
import java.io.*;

public class BOJ_2675
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); //TestCase
		for(int i=0; i<T; i++){
			String str = br.readLine(); // 3 ABC
			StringTokenizer st = new StringTokenizer(str," "); // 3, ABC
			int R = Integer.parseInt(st.nextToken()); // repeat, 3
			String S = st.nextToken();				  // ABC
			
			for(int j=0; j<S.length(); j++){
				for(int k=0; k<R; k++){
					System.out.printf("%c",S.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}