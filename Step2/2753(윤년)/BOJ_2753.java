// 2753(윤년)

package Step2;

import java.io.*;

public class BOJ_2753
{
	public static void main (String[] args) throws IOException{
		//anner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int year = sc.nextInt();
		int year = Integer.parseInt(br.readLine());
		br.close();
		
		if(year%4==0 && year%100!=0 || year%400 == 0){
			System.out.println("1"); 
		}
		else{
			System.out.println("0");
		}
	}
}
