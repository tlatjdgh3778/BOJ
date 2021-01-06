// 2775(부녀회장이 될테야)

package Step8;

import java.io.*;

public class BOJ_2775
{
	public static int[][] APT = new int[15][15]; // 층 호
	
	public static void main (String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		make_APT(); // 아파트 만들
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++){
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			sb.append(APT[n][k]).append('\n');
		}
		System.out.println(sb);
		}
	public static void make_APT(){
		for(int i=0; i<15; i++){
			APT[i][1] = 1; // i층 1호 1로 초기화
			APT[0][i] = i; // 0층은 1.2.3.4....
		}
		for(int i=1; i<15; i++){ // 1층 ~ 14층
			for(int j=2; j<15; j++){ // 2호 ~ 14호
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}	
	}
}
