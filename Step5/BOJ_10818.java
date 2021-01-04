// 10818(최소, 최대)

package Step5;

import java.util.*;
import java.io.*;

public class BOJ_10818
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int min, max;
		int N = Integer.parseInt(br.readLine()); // 5
		int score[] = new int[N];
		String string = br.readLine();
		StringTokenizer st = new StringTokenizer(string," ");
		
		for(int i=0; i<score.length; i++){
			score[i] = Integer.parseInt(st.nextToken());
		}
		min = score[0];
		max = score[0];
		
		for(int i=0; i<score.length; i++){
			if(score[i]<min){
				min = score[i];
			}
			if(score[i]>max){
				max = score[i];
			}
		}

		System.out.printf("%d %d",min,max);
	}
}