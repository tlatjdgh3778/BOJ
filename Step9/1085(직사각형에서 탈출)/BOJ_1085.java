// 1085(직사각형에서 탈출)

package Step9;

import java.util.*;
import java.io.*;

public class BOJ_1085
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int[] arr = new int[4];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int a = h-y; // 위까지 거리
		int b = w-x; // 오른쪽까지 거리
		int min = 1000;
		
		if(min>x){
			min=x;
		}
		if(min>y){
			min=y;
		}
		if(min>a){
			min=a;
		}
		if(min>b){
			min=b;
		}
		/*for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			if(min>arr[i]){
				min = arr[i];
			}
		}*/
		System.out.println(min);
		/*for(int i=0; i<4; i++){
			if(min>)
		}*/
	}
}
