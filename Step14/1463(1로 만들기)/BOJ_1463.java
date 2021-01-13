// 1463(1로 만들기)

package Step14;

 import java.io.*;
 
 public class BOJ_1463
 {
     public static void main (String[] args) throws IOException
     {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         int n = Integer.parseInt(br.readLine());
         int[] dp = new int[1000001]; 
         // dp[n] = n일 때 연산횟수의 최소
         // 연산
         // 1. x%3==0 .. x/3
         // 2. x%2==0 .. x/2
         // 3. x = x-1
         dp[1] = 0;
         dp[2] = dp[3] = 1;
         
         for(int i=4; i<=n; i++){
             if(i%3==0 && i%2==0){
                 // if 6..
                 dp[i] = Math.min(dp[i/3],Math.min(dp[i-1],dp[i/2])) + 1;
             }else if(i%3==0 && i%2!=0){
                 // 3,,9,,
                 dp[i] = Math.min(dp[i-1],dp[i/3]) + 1;
             }else if(i%3!=0 && i%2==0){
                 // 4..
                 dp[i] = Math.min(dp[i-1],dp[i/2]) + 1;
             }else{
                 dp[i] = dp[i-1] + 1;
             }
         }
         System.out.println(dp[n]);
     }
 }
