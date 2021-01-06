// 4153(직각삼각형)

package Step9;

import java.util.*;
import java.io.*;

public class BOJ_4153
{
	public static StringTokenizer st;
	public static double[] arr = new double[3];
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 0 0 0 입력 시 종료.
		double tmp = 0;
		while(true){
			st = new StringTokenizer(br.readLine()," ");
			for(int i=0; i<arr.length; i++){
				arr[i] =  Double.parseDouble(st.nextToken());
			}
			if(arr[0]==0){break;}
			for(int i=0; i<2; i++){
				if(arr[i]>arr[i+1]){
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
			int a = (int)Math.pow(arr[0],2);
			int b = (int)Math.pow(arr[1],2);
			int c = (int)Math.pow(arr[2],2); // 최댓값
			if((a+b)==c){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
		}
	}
}