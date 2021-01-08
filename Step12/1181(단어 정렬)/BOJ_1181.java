// 1181(단어 정렬)

package Step12;

import java.util.*;
import java.io.*;

public class BOJ_1181
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		// 배열에 단어가 이미 초기화 되었다고 가정
		for(int i=0; i<N; i++){
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2){
				// 오름차순 정렬
				// compare 메소드는 양의 정수, 0, 음의 정수 3가지 리턴 값에 의해
				// 위치를 바꿀지 결정하게 됨.
				// 양수 = 바꿈, 0, 음수는 안 바꿈
				// 정렬 방법 구현
				// 리턴 값은 int 로 나옴
				if(s1.length() == s2.length()){
					return s1.compareTo(s2); 
					// 사전적 비교
					// 사전 순 정렬
				}
				else{
					return s1.length() - s2.length();
				}
			}
		});
		sb.append(arr[0] + '\n');
		for(int i=1; i<N; i++){
			// 중복되지 않는 단어만 출력해야함
			if(!arr[i].equals(arr[i-1])){
				sb.append(arr[i] + '\n');
			}
		}
		System.out.println(sb);
	}
}
