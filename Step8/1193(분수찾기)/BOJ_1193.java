// 1193(분수찾기)

package Step8;

import java.io.*;

public class BOJ_1193
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int cross_cnt = 1;
		int prev_cnt_sum = 0;
		
		while(true){
			// 직전 대각선 누적합 + 해당 대각선 개수를 이용해서 범위 판별
			if(X <= prev_cnt_sum + cross_cnt){
				if(cross_cnt % 2 == 1) { //홀수면?
					//대각선 수 - (X - 이전 sum - 1) / X - 이전 sum
					System.out.println(cross_cnt-(X - prev_cnt_sum - 1) + "/" + (X - prev_cnt_sum));
					break;
				}else{ // 짝수면 ?
					System.out.println(X - prev_cnt_sum + "/" + (cross_cnt - (X - prev_cnt_sum - 1)));
					break;
				}
			}
			else{
				prev_cnt_sum = prev_cnt_sum + cross_cnt;
				cross_cnt++;
			}
		}	
	}
}
