// 2565(전깃줄)

package Step14;

import java.util.*;
import java.io.*;

public class BOJ_2565
{
   public static int N;
   public static StringTokenizer st;
   public static int[][] wire;
   public static Integer[] DP;
   public static void main (String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      //int cnt = 0;
      
      N = Integer.parseInt(br.readLine());
      wire = new int[N][2];
      DP = new Integer[N];
      // wire 2차원 배열에 전깃줄 값 저장.
      // A = wire[N][0]
      // B = wire[N][1]
      for(int i=0; i<N; i++){
      	st = new StringTokenizer(br.readLine()," ");
      	wire[i][0] = Integer.parseInt(st.nextToken());
      	wire[i][1] = Integer.parseInt(st.nextToken());
      }
      
      //2차원 배열 A 기준으로 오름차순
      Arrays.sort(wire, new Comparator<int[]>(){
      	@Override
      		public int compare(int[] o1, int[] o2){
      			return o1[0] - o2[0];
      		}
      });
      
      //정렬까지 완료 ----------
      //비교해서 그 다음 값이 더 작으면 카운트 ㄴㄴ
      // 왼쪽은 오름차순 완성.. 오른쪽에 대해 오름차순을 구하면 됨
      // LIS 구하기.
      for(int i=0; i<N; i++){
      	LIS(i);
      }
      int max = 1;
      for(int i=0; i<N; i++){
      	max = Math.max(DP[i],max);
      }
      System.out.println(N-max);
    }
    public static int LIS(int N){
    	if(DP[N] == null){
    		DP[N] = 1;
    		for(int i=N-1; i>=0; i--){
    			if(wire[i][1] < wire[N][1]){
    				DP[N] = Math.max(DP[N], LIS(i) + 1);
    			}
    		}
    	}
    	return DP[N];
    }
}