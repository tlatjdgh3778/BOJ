// 1316(그룹 단어 체커)

package Step7;

import java.io.*;

public class BOJ_1316
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException
	{
		
		int N = Integer.valueOf(br.readLine()); // N<=100 
		int cnt = 0;
		
		for(int i=0; i<N; i++){
			if(check() == true){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static boolean check() throws IOException{
		boolean[] check = new boolean[26]; //default value = false
		int prev = 0;

			String str = br.readLine();
			for(int j=0; j<str.length(); j++){
				int now = str.charAt(j);
				
				if(prev!=now){
					if(check[now-'a'] == false){
						check[now-'a'] = true;
						prev = now; // 'a' = 97
					}
					else{
						return false; //exit
					}
				}
				else{
					continue;
				}
			}
		return true;
	}
}