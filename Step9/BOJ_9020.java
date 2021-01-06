// 9020(골드바흐의 추측)

package Step9;

import java.io.*;

public class BOJ_9020
{
	public static boolean[] prime = new boolean[10001];
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		get_prime();

		while(T-->0){
			int n = Integer.parseInt(br.readLine());
			int p = n/2;
			int q = n/2;
			
			while(true){
				if(prime[p]==false && prime[q]==false){ // 둘 다 소수면
					System.out.printf("%d %d\n",p,q);
					break;
				}
				p--;
				q++;
			}
		}
	}
	public static void get_prime(){
		prime[0] = prime[1] = true; // 0이랑 1은 소수가 아니니까
		for(int i=2; i<Math.sqrt(prime.length); i++){
			for(int j=2; i*j<prime.length; j++){
				prime[i*j] = true; //i의 배수를 true로 .. 소수가 아니다
			}
		}
	}
}