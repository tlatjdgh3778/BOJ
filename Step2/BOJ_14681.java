// 14681(사분면 고르기)

package Step2;

import java.io.*;

public class BOJ_14681
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//구분문자 설정하기, " "
		//StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x>0 && y>0){
			System.out.println("1");
		}
		else if(x>0 && y<0){
			System.out.println("4");
		}
		else if(x<0 && y>0){
			System.out.println("2");
		}
		else if(x<0 && y<0){
			System.out.println("3");
		}
	}
}