// 11720(숫자의 합)

package Step7;

import java.io.*;

public class BOJ_11720
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int ans;
        int sum = 0;;
        
		for(int i=0; i<N; i++){
			ans = str.charAt(i)-'0'; // '0' 또는 48을 빼주면 연산 가능
			sum = sum + ans;
		}
		System.out.println(sum);
	}
}
