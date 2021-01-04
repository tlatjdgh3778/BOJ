// 1546(평균)

package Step5;

import java.util.*;
import java.io.*;

public class BOJ_1546
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		String string = br.readLine();
		StringTokenizer st = new StringTokenizer(string," ");
		double score[] = new double[N];
		double sum = 0;
		
		for(int i=0; i<N; i++){
			score[i] = Integer.parseInt(st.nextToken());
		}
		// find max score
		for(int i=0; i<N-1; i++){
				if(score[i]>score[i+1]){
					double tmp = score[i];
					score[i] = score[i+1];
					score[i+1] = tmp;
			}
		}
		double M = score[N-1];
		for(int i=0; i<N; i++){
			score[i]=(score[i]/M)*100;
			sum = sum + score[i];
		}
		double avg = sum/N;
		
		System.out.printf("%f",avg);
	}
}