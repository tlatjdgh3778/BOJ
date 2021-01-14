// 1931(회의실 배정)

package Step15;

import java.util.*;
import java.io.*;

public class BOJ_1931
{
	public static StringTokenizer st;
	public static int N;
	public static int[][] arr;
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		
		for(int i=0; i<N; i++){
		st = new StringTokenizer(br.readLine());
		arr[i][0] = Integer.parseInt(st.nextToken());
		arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		/*for(int i=0; i<N; i++){
			for(int j=0; j<2; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}*/
		// 종료시간 순으로 정렬하기
		// 종료시간이 같으면 시작시간 오름차순
		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2){
				if(o1[1] == o2[1]){
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		// 종료시간이 빠른 활동 먼저 선택
		// 하지만 선택한 활동의 종료시간과 선택할 활동의 시작시간이 겹치면 ㄴㄴ
		int prev_end_time = 0;
		int cnt = 0;
		
		// 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신 
		// = 종료랑 시작 겹치지않음 ㅇㅇ
		for(int i=0; i<N; i++){
		if(prev_end_time <= arr[i][0]){
			prev_end_time = arr[i][1];
			cnt++;
			}
		}
		System.out.println(cnt);
	}
}