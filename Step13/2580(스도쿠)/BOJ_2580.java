// 2580(스도쿠)

package Step13;

import java.util.*;
import java.io.*;

public class BOJ_2580
{
	public static StringBuilder sb = new StringBuilder();
	public static StringTokenizer st;
	public static int[][] arr = new int[9][9];
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 스도쿠 입력하기
		for(int i=0; i<9; i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<9; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// row 0 col 0 부터 9,9 까지 탐색하기 위함.
		sdoku(0, 0);

	}
	//System.exit(0) 시스템 종료. 스도쿠 여러개 출력 방지.
	public static void sdoku(int row, int col){
		// 해당 행의 끝까지 검색하면 ~
		if(col == 9){
			sdoku(row+1, 0);
			return;
		}
		// 행이 끝까지 가면
		if(row ==9){
			for(int i=0; i<9; i++){
				for(int j=0; j<9; j++){
					sb.append(arr[i][j]+" "); 
				}
				sb.append('\n');
			}
		// 스도쿠 출력
		System.out.println(sb);
		System.exit(0);
		}
		// 해당 위치가 0이라면 1~9까지 가능한 수 탐색..
		if(arr[row][col] ==0){
			for(int i=1; i<=9; i++){
				if(Possibility(row, col, i)){
					// true 는 3가지 조건에 안 걸렸다는 뜻
					// 들어갈 가능성이 있다 ㅇㅇ
					// 확정은 아님
					arr[row][col] = i;
					sdoku(row, col+1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		sdoku(row, col+1);
		
	}
	public static boolean Possibility(int row, int col, int value){
		// 가로에 1-9 있는지
		for(int i=0; i<9; i++){
				if(arr[row][i] == value){
					// 같은 행에 value랑 같은 값이 있다는 뜻
					return false; 
				}
		}
		// 세로에 1-9 있는지
		for(int i=0; i<9; i++){
				if(arr[i][col] == value){
					// 같은 열에 value랑 같은 값이 있다는 뜻
					return false;
				}
		}
		// 3x3에 1-9 있는지
		// 시작지점
		int start_row = (row/3) * 3;
		int start_col = (col/3) * 3;
		// start_row 가 0이면.. 0,1,2 
		for(int i=start_row; i<start_row+3; i++){
			for(int j=start_col; j<start_col+3; j++){
				// 그 쪽 3x3 안에 속한 값인가 ?
				if(arr[i][j] == value){
					return false;
				}
			}
		}
		
		//중복되는 값이 없는 경우..
		return true;
	}
}
