// 9663(N-Queen)

package Step13;

import java.io.*;

public class BOJ_9663
{
	public static int[] arr;
	public static int cnt, N;
	
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		cnt = 0;
		
		nQueen(0);
		System.out.println(cnt);
	}
	public static void nQueen(int depth){
		if(depth == N){
			// N행까지 내려갔으면..
			cnt++;
			return;
		}
		
		for(int i=0; i<N; i++){
			// 젤 처음에는 depth 0 i 0 이니 (0,0)에 퀸을 두고시작
		arr[depth] = i; 
		
		if(Possibility(depth)){
			//만약 놓을 수 있으면 그 다음 검사
			nQueen(depth+1);
		}
	}	
		
	}
	public static boolean Possibility(int col){
		for(int i=0; i<col; i++){
			// 해당 
			if(arr[col] == arr[i]){
				return false;
			}
			// 같은 대각선에 있다면.. 열의 차, 행의 차 == 면 
			else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i])){
				return false;
			}
		}
		
		return true;
	}
}