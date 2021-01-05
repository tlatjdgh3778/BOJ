// 4344(평균은 넘겠지)

package Step5;

import java.util.*;
import java.io.*;

public class BOJ_4344
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());

		for(int i=0; i<C; i++){
		double sum = 0;
		double avg = 0;
		int cnt = 0;
		double rate = 0;
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int N = Integer.parseInt(st.nextToken());
		double score[] = new double[N];
		
			for(int j=0; j<N; j++){
				score[j] = Integer.parseInt(st.nextToken());
				sum = sum + score[j];
			}
		avg = sum/N;
		for(int j=0; j<N; j++){
			if(score[j]>avg) cnt++;
		}
		rate = (double)cnt/N;
		System.out.printf("%.3f",rate*100);
		System.out.println("%");
		}
	}
}
