// 1018(체스판 다시 칠하기)

package Step11;

import java.util.*;
import java.io.*;

public class BOJ_1018
{
	public static boolean[][] arr;
	public static int min = 64;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N][M];
		
		for(int i=0; i<N; i++){
			String str = br.readLine();
			for(int j=0; j<str.length(); j++){
				if(str.charAt(j) == 'W'){
					arr[i][j] = true; //'W' 면 true
				}else{
					arr[i][j] = false; // 'B' 면 false
				}
			}
		}
		
		int N_row = N - 7;
		int M_col = M - 7;
		
		for(int i=0; i<N_row; i++){
			for(int j=0; j<M_col; j++){
				find(i,j);
			}
		}
		System.out.println(min);
	}
	
	public static void find(int x, int y){
		int end_x = x + 8;
		int end_y = y + 8;
		int cnt = 0;
		
		boolean TF = arr[x][y]; // 첫 번째 칸의 색
		
		for(int i=x; i<end_x; i++){
			for(int j=y; j<end_y; j++){
				if(arr[i][j] != TF){
					cnt++;
				}
				TF = (!TF);
			}
			TF= !TF;
		}
		
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}
}
