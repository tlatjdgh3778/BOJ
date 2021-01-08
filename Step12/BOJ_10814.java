// 10814(나이순 정렬)

package Step12;

import java.util.*;
import java.io.*;

public class BOJ_10814
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][2];

		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		Arrays.sort(arr, new Comparator<String[]>(){
			@Override
			public int compare(String[] s1, String[] s2){
				// 오름차순 정렬
				// compare 메소드는 양의 정수, 0, 음의 정수 3가지 리턴 값에 의해
				// 위치를 바꿀지 결정하게 됨.
				// 양수 = 바꿈, 0, 음수는 안 바꿈
				// 정렬 방법 구현
				// 리턴 값은 int 로 나옴
					return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
				/*else{
					return s1[0] - s2[0];
				}알아서 입력순으로 정렬됨.*/
			}
		});
		for(int i=0; i<N; i++){
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}