// 2884(알람 시계)

package Step2;

import java.util.*;
import java.io.*;

public class BOJ_2884{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		
		StringTokenizer st = new StringTokenizer(a," ");
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		int aH = H;
		int aM = M - 45;
		if(aM<0){
			aM = 60 + aM;
			aH = aH - 1;
			if(aH<0){
				aH = 24 + aH;
			}
		}
		/*else if(aM>=0){
			aM = aM;
			aH = aH;
		}*/
		System.out.printf("%d %d", aH,aM);
        br.close();
	}
}
