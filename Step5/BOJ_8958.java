// 8958(OX퀴즈)

package Step5;

import java.io.*;

public class BOJ_8958 {

	public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());		// 테스트 케이스 개수
        
        //sc.nextLine();			// 버퍼 초기화
		String[] inputs = new String[tc];	

		for(int i = 0; i < tc; i++) {
			inputs[i] = br.readLine();		// 입력한 문자열을 배열에 저장
		}
		
		for(String s : inputs) {
			int temp = 0;			// 문제당 점수를 저장할 변수
			int score = 0;			// 총 점수를 저장할 변수
			for(int i = 0; i < s.length(); i++) {
				if(s.substring(i, i + 1).equals("O")) {
					++ temp;			// 문제당 점수를 1 더함
					score += temp;			// 총 점수에 더함 
				} else {
					temp = 0;			// 문제당 점수를 0으로 되돌림
				}
			}
			System.out.println(score);
		}
	}
}
