// 2751(수 정렬하기 2)

package Step12;

import java.util.*;
import java.io.*;

public class BOJ_2751
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++){
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);
		
		for(int i=0; i<arr.size(); i++){
			sb.append(arr.get(i)).append('\n');
		}
		System.out.println(sb);
	}
}
