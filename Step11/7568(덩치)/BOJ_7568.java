// 7568(덩치)

package Step11;

import java.util.*;
import java.io.*;

public class BOJ_7568
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt;
        
		int testcase = Integer.parseInt(br.readLine()); 
		int[] arr = new int[testcase];
		int[] brr = new int[testcase];
		int x,y = 0;
		for(int i=0; i<testcase; i++){
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i] = Integer.parseInt(st.nextToken());
			brr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<testcase; i++){
			x = arr[i];
			y = brr[i];
			cnt=1;
			for(int j=0; j<testcase; j++){
				if(x==arr[j] && y==brr[j]){
					//cnt=cnt;
				}
				else if(x<arr[j] && y<brr[j]){
					cnt++;
				}
			}
			System.out.printf("%d ",cnt);
		}
	}
}
